SELECT
  W.id
  , WP.age
  , W.coins_needed
  , W.power
FROM
  Wands W
  INNER JOIN
  Wands_Property WP
  ON W.code = WP.code
WHERE WP.is_evil = 0 AND W.coins_needed = (SELECT MIN(coins_needed) 
                                          FROM Wands X
                                          INNER JOIN Wands_Property AS Y 
                                          ON X.code = Y.code 
                                          WHERE X.power = W.power AND Y.age = WP.age)
ORDER BY
  W.power DESC, WP.age DESC;

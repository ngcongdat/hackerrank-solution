SELECT
  CASE
    WHEN Occupation = 'Doctor' THEN Name + '(D)'
    WHEN Occupation = 'Professor' THEN Name + '(P)'
    WHEN Occupation = 'Singer' THEN Name + '(S)'
    WHEN Occupation = 'Actor' THEN Name + '(A)'
  END
FROM Occupations
ORDER BY Name;
SELECT
  'There are a total of'
  , COUNT(Occupation)
  , CONCAT(LOWER(Occupation), 's.')
FROM Occupations
GROUP BY Occupation
ORDER BY COUNT(Occupation), Occupation;

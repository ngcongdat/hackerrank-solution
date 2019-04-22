SELECT
  H.hacker_id, H.name
FROM
  Hackers AS H
  INNER JOIN
  Submissions AS S
  ON H.hacker_id = S.hacker_id
  INNER JOIN
  Challenges AS C
  ON S.challenge_id = C.challenge_id
  INNER JOIN
  Difficulty AS D
  ON C.difficulty_level = D.difficulty_level
WHERE
  C.difficulty_level = D.difficulty_level AND S.score = D.score
GROUP BY
  H.hacker_id, H.name
HAVING
  COUNT(H.hacker_id) > 1
ORDER BY COUNT(H.hacker_id) DESC, H.hacker_id;

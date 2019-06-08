SELECT h.hacker_id,
       h.NAME,
       Count(challenge_id) AS c_count
FROM hackers h
       LEFT JOIN challenges c
              ON h.hacker_id = c.hacker_id
GROUP BY h.hacker_id,
          h.NAME
HAVING 
    c_count = (SELECT Max(t_count)
               FROM
                (SELECT Count(challenge_id) AS t_count
                 FROM challenges
                 GROUP  BY hacker_id) AS tbl)
    OR 
    c_count IN (SELECT t_count
                FROM
                 (SELECT Count(challenge_id) AS t_count
                  FROM   challenges
                  GROUP  BY hacker_id) AS tbl
    GROUP  BY t_count
    HAVING Count(t_count) = 1)
ORDER  BY 
    c_count DESC,
    h.hacker_id ASC

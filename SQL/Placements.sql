SELECT s.name
FROM 
    Packages p1
    INNER JOIN 
        Friends f on p1.ID = f.ID
    INNER JOIN 
        Students s on f.ID = s.ID
    INNER JOIN 
        Packages p2 on p2.ID = f.Friend_ID
WHERE 
    p1.Salary < p2.Salary
ORDER BY
    p2.Salary

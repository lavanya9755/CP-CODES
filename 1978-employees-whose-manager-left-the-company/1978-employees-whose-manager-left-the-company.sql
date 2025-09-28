SELECT e.employee_id 
FROM (
    SELECT * 
    FROM Employees 
    WHERE manager_id IS NOT NULL
) e
WHERE e.salary < 30000 
  AND NOT EXISTS (    -- dont use not null , because if either side is null then it wont work and give unknown cmd
        SELECT 1
        FROM Employees m
        WHERE m.employee_id = e.manager_id
      );

order by e.employee_id ;

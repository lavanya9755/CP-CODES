# Write your MySQL query statement below
select name 
from Employee
where id in (select managerId 
from Employee 
where managerId IS NOT NULL 
group by managerId 
having count(*)>=5
);
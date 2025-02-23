select email as Email
from Person p1 
group by email
having count(*)>1
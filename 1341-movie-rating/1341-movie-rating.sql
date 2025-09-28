(select u.name as results from Users u 
                    join MovieRating mr using(user_id)
                    group by user_id,u.name
                    ORDER BY count(mr.movie_id) DESC, u.name
                    limit 1
)
union all
(
select title as results 
from Movies m join MovieRating r on m.movie_id = r.movie_id 
where Month(created_at) = 2 and Year(created_at) = 2020 
group by m.movie_id 
order by avg(rating) desc, title asc 
limit 1);
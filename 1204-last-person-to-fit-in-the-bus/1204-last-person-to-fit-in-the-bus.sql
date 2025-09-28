with abc as(
    select turn , person_name, sum(weight) over(order by turn) as cum_weight
    from Queue
)

select person_name from abc
where cum_weight <= 1000
order by cum_weight
limit 1;
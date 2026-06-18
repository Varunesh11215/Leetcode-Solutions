(
select u.name as results
from Users u 
join MovieRating as mr On u.user_id=mr.user_id
group by u.user_id
order by count(*) desc,u.name asc
limit 1
)
union all 
(
select m.title as results
from Movies m
join MovieRating as mr on m.movie_id=mr.movie_id
where mr.created_at like '2020-02-%'
group by mr.movie_id
order by avg(mr.rating) desc,m.title asc
limit 1
)
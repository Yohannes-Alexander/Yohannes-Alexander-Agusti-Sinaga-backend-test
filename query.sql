SELECT m.id id_murid, m.name, p.status, m.time_create, p.time_create time_update
FROM murid m
JOIN pendidikan p ON m.id=p.id_murid
where p.time_create = (
  select max(pend.time_create)
    from pendidikan pend
    where p.id_murid = pend.id_murid
)
;





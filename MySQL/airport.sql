Create schema Air;
create table Air.airport_details (id int primary key not null, airport_name varchar(45), location varchar(45), no_arilines int);
select * from airport_details;
select id,location from airport_details;
insert into airport_details value(1,"Kempegwoda Airport","Blr",10);
select airport_name from airport_details where id=2;
update airport_details set airport_name="Mangalore Airport",location="Mangalore",no_arilines=15 where id=2;
select * from airport_details group by airport_name;
delete from airport_details where airport_name="Kempegwoda";


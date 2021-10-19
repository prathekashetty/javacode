create table passanger(
p_id int primary key not null,
p_name varchar(45),
p_contact long,
a_id int,
constraint foreign key(a_id) references airport_details(id));

SELECT * FROM air.passanger;
insert into passanger values
(4,"Jayanthi",234596789,2);

SELECT * FROM air.passanger left join airport_details on a_id=id;
SELECT * FROM air.passanger right join airport_details on a_id=id;
SELECT * FROM air.passanger full join airport_details on a_id=id;
SELECT * FROM air.passanger inner join airport_details on a_id=d;

SELECT * FROM air.passanger full join airport_details;
SELECT * FROM air.passanger inner join airport_details;


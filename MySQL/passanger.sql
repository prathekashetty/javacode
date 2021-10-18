create table passanger(
p_id int primary key not null,
p_name varchar(45),
p_contact long,
a_id int,
constraint foreign key(a_id) references airport_details(id));

SELECT * FROM air.passanger;
insert into passanger values
(1,"Pratheeka",91456789,1),
(2,"Shetty",23456789,2);

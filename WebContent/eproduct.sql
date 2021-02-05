use ecomercedb;
create table eproduct(
	id bigint primary key auto_increment,
	name varchar(100), price decimal(10,2),
	createdAt timestamp default now(),
	modifiedAt timestamp default now());

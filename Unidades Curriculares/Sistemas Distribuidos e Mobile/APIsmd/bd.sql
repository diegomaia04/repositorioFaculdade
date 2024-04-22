create database microservico;
use microservico;

create table personagens (
id int primary key auto_increment,
nome varchar(255) not null,
classe varchar(50) not null,
nivel int(11) not null
);
 select * from personagens;
describe personagens;

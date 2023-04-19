create database projeto;
use projeto;

create table empregado(
Cod_Emp int primary key auto_increment,
nome varchar (30) not null,
sobrenome varchar(30) not null,  
CPF char (11)not null,
salario float not null, 
Cod_depto int not null,
foreign key(Cod_depto) references departamento(Cod_depto)
);

create table departamento (
nome varchar(30),
Cod_depto int primary key auto_increment
);

create table trabalha(
Cod_Emp int not null,
Cod_proj int not null,
foreign key(Cod_Emp) references empregado(Cod_Emp),
foreign key(Cod_proj) references projeto(Cod_proj)
);

create table projeto(
Cod_proj int primary key auto_increment not null,
Nome varchar(30) not null,
DataIni date,
DataFim date,
Duracao int
);

show tables;


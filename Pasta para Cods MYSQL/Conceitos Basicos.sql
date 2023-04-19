/*
Banco Usado para Aprender Banco de Dados 
Utilizado no Curso Faculdade Ciência da Computação
SQL -- DLL / SQL --DML / SQL -- DCL

-- DLL - Create, Drop, Alter

-- DML - 

-- DCL -

*/

-- Criar e acessar o Banco de Dados
create database teste;
use teste;

-- Criar Tabela no Banco de Dados
create table teste(
codigo int primary key not null,
nome varchar (30) not null,
descricao varchar(100)
);

-- excluindo uma tabela
drop table teste_teste;

-- Alterando a tabela e incluindo a integridade da tabela
Alter table teste
add DATA_ADM date;
Alter table teste
add constraint PK_TESTE primary key (codigo);

-- alterando o tipo de dado em uma coluna
alter table teste
modify data_adm int;

-- alterar um nome de uma coluna na tabela
alter table teste
change column codigo cod_teste int;

-- exlucindo uma coluna na tabela
alter table teste
drop column data_adm;

-- alterando o nome da tabela 
alter table teste
rename to teste_teste;

-- Inserir dados e pesquisar o dados na tabela
select * from teste;
insert into teste(codigo, nome, descricao) values ('1','Diego', 'teste para ver a funcionalidade do banco e tabela');


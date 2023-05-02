/*
Banco Usado para Aprender Banco de Dados 
Utilizado no Curso Faculdade Ciência da Computação
SQL -- DLL / SQL --DML / SQL -- DCL

-- DLL - Create, Drop, Alter

-- DML - CRUD (create, read, update, drop)

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

-- Comandos DML
-- selecionar empregados com slaarios maior que 2000 reias
select nome, cod_emp from empregado where salario > 2000;

-- Inserir dados na tabela departamento
insert into departamento (cod_depto, nome) values(100, 'RECURSOS HUMANOS');
insert into departamento values(101, 'VENDAS');

insert into departamento 
values (102, 'CONTABILIDADE'),
	   (103, ' INFORMÁTICA'),
       (104, 'ADMINISTRAÇÃO');
       
select * from departamento;

-- inserindo dados na tabela empregado

    INSERT INTO EMPREGADO
	(NOME, SOBRENOME, CPF, ENDERECO, SALARIO, COD_DEPTO)
    VALUES ('VICTOR', 'SILVA', '12345678910', 'AVENIDA PAULISTA, 2000', 1000.00, 103);
    INSERT INTO EMPREGADO
	(NOME, SOBRENOME, CPF, ENDERECO, SALARIO, COD_DEPTO)
    VALUES ('KAUA', 'SILVA', '12345678911', 'AVENIDA PAULISTA, 2000', 1000.00, 102);
    INSERT INTO empregado
	(NOME, SOBRENOME, CPF, ENDERECO, SALARIO, COD_DEPTO)
	VALUES ('JOSE', 'DA SILVA', '12345678910', 'AVENIDA PAULISTA, 2000', 3000.00, 101),
		   ('JOÃO', 'SOUZA', '12345678911', 'AVENIDA FARIA LIMA, 500', 5000.00, 102);
	INSERT INTO EMPREGADO
	(NOME, SOBRENOME, CPF, SALARIO, COD_DEPTO)
    VALUES ('DIOGO', 'GUILHERME', 12121212122, 2000.000, 102),
           ('RODOLFO,', 'ARIEL', 13131313111, 3000.00, 101),
           ('GUSTAVO', 'ROSSETTI', 14141422222, 2000.00, 104),
           ('JOÃO', 'PEDRO', 15151515888, 3000.00, 103);
    
-- dando update nas iformaçooes da tabela empregado
select * from empregado;
update empregado set salario = 1500.00 where cod_emp = 1;
update empregado set endereco = 'Faria lima, 500' where  cod_emp = 2;

-- alterarra regra de segurança do mysql para permitir realização de varias linhas ao mesmo tempo
set sql_safe_updates = 0;

-- Comando para excluir regsitros de uma tabela
-- excluie o registro
select cod_emp from empregado where nome = 'VICTOR' and sobrenome  = 'SILVA';
delete from empregado where cod_emp = 1010; 

-- excluir varias linhas sem o where
delete from empregado;

-- exercico fazer o insert de doiss registros na atabela projeto e vinuclar um empregado a cada prjeto criado

INSERT INTO Projeto 
	(Cod_Proj, Nome)
	VALUES (1, 'Projeto aplicativo'), (2, 'Projeto Secudnario');
    select * from projeto;
    
    INSERT INTO Trabalha
	(cod_emp, cod_proj)
    VALUES (4, 1), (5, 2);
    
select * from trabalha; 
    
-- Função de agregação
-- Buscar na tabela empregado nome e sobrenome dos empregados quemoram em avenidas
select nome, sobrenome from empregado where endereco like 'Avenida%';
    
-- bsucar empregado que tem a letra a no nome
select nome, sobrenome from empregado where nome like '%A%';
    
-- BUSCAR NA TABELA EMPREGADO NOME, CPF E ENDEREÇO DOS EMPREGADOS QUE POSSUEM SALARIO SUPERIOR A 2000 EM ORDEM CRESCENTE
SELECT NOME, CPF, ENDERECO, SALARIO FROM EMPREGADO
WHERE SALARIO > 2000.00
ORDER BY NOME ASC;

-- funções de agregações(Sum(soma), AVG(media), MAX(maior), count(contador))
-- SUM - Somar o salario dos empregados
select sum(salario) from empregado;


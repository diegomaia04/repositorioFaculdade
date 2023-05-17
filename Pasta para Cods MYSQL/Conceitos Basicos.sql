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
           
           insert into empregado (NOME, SOBRENOME, CPF, SALARIO, COD_DEPTO) values ('luciano', 'alves', 15879+5888, 3500.00, 104);
            insert into empregado (NOME, SOBRENOME, CPF, SALARIO, COD_DEPTO) values ('weligton', 'mouse', 15879+5888, 3500.00, 101);
    
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
select sum(salario) from  empregado where salario <3000;


-- AVG- fazer media dos salarios
select avg(salario) from empregado;

-- MIN - menor valor
select min(salario) from empregado;

-- MAX - maior salarrio
select max(salario) from empregado;

-- contar quantos empregados existem em cada departamento pelo codigod do depaartmentp
select cod_depto, count(cod_depto) from empregado group by cod_depto;

-- descobiri a soma dos salarios dos empregados para cada departamento
select sum(salario), count(cod_depto) from empregado group by cod_depto;

-- Aumentar o Salario dos empregadso em 10%
update empregado
set salario = salario +(salario *0.1);

-- permitir todas os updates dentro das tabelas.
set sql_safe_updates = 0;

-- alterar a tabela empregado e incluir a coluna cidade com tipo de dado varchar(30)
-- atualaizar os registros dos empregados de coigod 1000, 1001 e 1002 para a cidade de são paulo
-- dos empregados de codigo 1003, 1005 para cidade de rio janeiro
-- empregado de coigod paara cuiaba

alter table empregado add column cidade varchar(30);
select * from empregado;

-- alterar o nuemro do cod_emp para o empregado dessejado.
update empregado set cidade = 'São Paulo' where cod_emp = 1005; 
update empregado set cidade = 'Rio de Janeiro' where cod_emp = 1008; 
update empregado set cidade = 'Cuiaba' where cod_emp = 1007; 

-- inserir tabela projeto
select * from projeto;
delete from projeto;

insert into projeto(cod_proj, nome) 
values(10, 'projeto aplicativo'), (20, 'projeto aplicativo');

INSERT INTO PROJETO
	VALUES (30, 'ALPHA', '20230616', '20230716', 30),
		   (40, 'BETA',  '20230516', '20230716', 60),
           (50, 'GAMA',  '20230530', '20230730', 60);
           
-- definir para cada projeto cirado 2 empregados
select * from trabalha;

insert into trabalha(cod_emp, cod_proj) values( 1003, 10) ,( 1004, 10);
insert into trabalha(cod_emp, cod_proj) values( 1005, 20) ,( 1006, 20);
insert into trabalha(cod_emp, cod_proj) values( 1007, 30) ,( 1008, 30);
insert into trabalha(cod_emp, cod_proj) values( 1009, 40) ,( 1011, 40);
insert into trabalha(cod_emp, cod_proj) values( 1012, 50) ,( 1013, 50);

delete from trabalha;

-- econtar os codigos dos empregados que possiem ums salario maior que 200 e moram em cuiaba
select cod_emp, nome from empregado where salario > 2000 and cidade = 'cuiaba';

-- lsitar os nomes dos empregados que vivem no rio de janeiro ou belo horizonte
select cod_emp, nome from empregado where cidade = 'rio de janeiro' or cidade = 'cuiaba';

-- descobir o codigo do departamento de cada empregado
select empregado.nome, departamento.nome from empregado, departamento;
 








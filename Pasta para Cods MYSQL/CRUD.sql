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
    VALUES ('KAUA', 'SILVA', '12345678910', 'AVENIDA PAULISTA, 2000', 1700.00, 102);
    select nome, cod_emp from empregado;
    
-- dando update nas iformaçooes da tabela empregado
select * from empregado;
update empregado set salario = 1500.00 where cod_emp = 1;
update empregado set endereco = 'Faria lima, 500' where  cod_emp = 2;

-- alterarra regra de segurança do mysql para permitir realização de varias linhas ao mesmo tempo
set sql_safe_updates = 0;

-- Comando para excluir regsitros de uma tabela
-- excluie o registro
select cod_emp from empregado where nome = 'VICTOR' and sobrenome  = 'SILVA';
delete from empregado where cod_emp = 1; 

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
    
    

    
    


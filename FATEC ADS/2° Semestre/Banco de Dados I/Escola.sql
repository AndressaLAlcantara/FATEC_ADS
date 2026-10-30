/*criação do banco ESCOLA*/
CREATE DATABASE Escola;
USE Escola;

CREATE TABLE TabAluno(
	matricula int auto_increment primary key,
    nome varchar(40) not null,
    sexo char(1) default 'M',
    datanasc date,
    curso char(3),
    nota1 decimal (5,2),
    nota2 decimal(5,2)
    );

CREATE VIEW AlunoView as
	Select * from TabAluno order by nome;
Create database Empresa;
Use Empresa;

Create Table depto (
	deptno int auto_increment primary key,
	dnome varchar(40) not null
);

Create Table emp (
	empno int auto_increment primary key,
	enome varchar(40) not null,
	esal numeric (7,2), 
	edatadm date,
	efuncao varchar(40) not null,
	depto int, foreign key (depto) references depto(deptno)
);

Create Table fones_emp (
	efone numeric (11) primary key,
	empno int, foreign key (empno) references emp(empno)
);


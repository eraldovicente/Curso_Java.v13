alter table empresas modify cnpj varchar(14);

insert into empresas
	(nome, cnpj)
values
	('Bradesco', 993485934823),
    ('Vale', 465677867867),
    ('Cielo', 01232342453);
    
desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;

insert into empresas_unidades
	(empresas_id, cidade_id, sede)
values
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);
CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar(50),
telefone varchar(11), email varchar(40) unique);

INSERT INTO cliente (nome, telefone, email) 
	VALUES('Adriano', '82738282', 'a@gmail.com'),
		  ('Adriana', '82719282', 'adr@gmail.com'),
		  ('Catarina', '92738282', 'catarina@gmail.com');
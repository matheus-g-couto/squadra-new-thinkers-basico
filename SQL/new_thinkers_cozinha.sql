-- Autor: Matheus Guimarães
-- Feito em PostgreSQL 13

-- ex1
CREATE DATABASE restaurante;

-- ex2
CREATE TABLE cozinha (
	tipo varchar(30) NOT NULL,
	num_cozinheiros int,
	num_pratos int,
	tempo_preparo int,
	hora_abertura int,
	hora_fechamento int,
	prato_principal varchar(30),
	PRIMARY KEY (tipo)
);

CREATE TABLE ingrediente (
	nome varchar(30) NOT NULL,
	data_validade date,
	PRIMARY KEY (nome)
);

CREATE TABLE funcionario (
	id_funcionario serial NOT NULL, 
	nome varchar(50) NOT NULL,
	atividade varchar(30),
	PRIMARY KEY (id_funcionario)
);

-- ex4
INSERT INTO cozinha (tipo, num_cozinheiros, num_pratos, tempo_preparo, hora_abertura, hora_fechamento, prato_principal) VALUES
	('Mineira', 8, 4, 30, 14, 20, 'Feijoada'),
	('Italiana', 10, 6, 45, 12, 22, 'Pizza'),
	('Chinesa', 12, 3, 25, 12, 20, 'Yakisoba'),
	('Árabe', 9, 3, 15, 11, 20, 'Esfiha'),
	('Mexicana', 7, 5, 30, 15, 22, 'Taco');

INSERT INTO ingrediente (nome, data_validade) VALUES
	('Feijão', '2021-05-05'),
	('Arroz', '2021-05-05'),
	('Carne', '2021-05-19'),
	('Queijo', '2021-05-19'),
	('Farinha', '2021-10-23'),
	('Molho de Tomate', '2021-06-02'),
	('Macarrão', '2021-08-08'),
	('Cebola', '2021-04-29'),
	('Brócolis', '2021-04-29'),
	('Pimenta', '2021-04-29'),
	('Jalapeño', '2021-03-31'),
	('Orégano', '2021-03-21');

INSERT INTO funcionario (nome, atividade) VALUES
	('Matheus Guimarães', 'Chef de Cozinha'),
	('Laura Colmatti', 'Chef de Cozinha'),
	('Enzo Miura', 'Cozinheiro'),
	('Gabriel Fajardo', 'Cozinheiro'),
	('Giovanna Couto', 'Cozinheira'),
	('Tássia Machado', 'Garçonete'),
	('Alan Paiva', 'Garçom'),
	('Victor Hugo Mattos', 'Garçom'),
	('Carlos Henrique Leão', 'Garçom'),
	('Valentina Bueno', 'Garçonete');

-- ex5
SELECT COUNT(1) AS total_cozinhas FROM cozinha;

-- ex6
SELECT tipo FROM cozinha WHERE hora_fechamento = 22;

-- ex7
SELECT * FROM ingrediente AS ingrediente_vencido WHERE data_validade < CURRENT_DATE;

-- ex8
CREATE TABLE cozinhaIngrediente (
	cozinha varchar(30),
	ingrediente varchar(30),
	PRIMARY KEY (cozinha, ingrediente)
);
ALTER TABLE cozinhaIngrediente ADD FOREIGN KEY (cozinha)
REFERENCES cozinha (tipo);
ALTER TABLE cozinhaIngrediente ADD FOREIGN KEY (ingrediente)
REFERENCES ingrediente (nome);

CREATE TABLE cozinhaFuncionario (
	cozinha varchar(30),
	funcionario int,
	PRIMARY KEY (cozinha, funcionario)
);
ALTER TABLE cozinhaFuncionario ADD FOREIGN KEY (cozinha)
REFERENCES cozinha (tipo);
ALTER TABLE cozinhaFuncionario ADD FOREIGN KEY (funcionario)
REFERENCES funcionario (id_funcionario);

-- ex9
SELECT tipo FROM cozinha
WHERE tipo NOT IN (
	SELECT cozinha FROM cozinhaingrediente
);

-- ex10
SELECT cozinha, count(funcionario) AS num_funcionarios FROM cozinhafuncionario
GROUP BY 1
HAVING count(funcionario) > 4;

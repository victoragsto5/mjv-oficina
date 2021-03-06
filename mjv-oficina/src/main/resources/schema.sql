DROP TABLE IF EXISTS TB_TIPO_VEICULO;
DROP TABLE IF EXISTS TB_AUTOMOVEL;
DROP TABLE IF EXISTS TB_PECAS;
DROP TABLE IF EXISTS TB_DEFEITOS;

-- TABELA TIPO_VEICULO --
CREATE TABLE TB_TIPO_VEICULO (
  ID_TIPO_VEICULO INT AUTO_INCREMENT  PRIMARY KEY,
  DESCR_TIPO_VEICULO VARCHAR(250) NOT NULL
);

INSERT INTO TB_TIPO_VEICULO (DESCR_TIPO_VEICULO) VALUES
  ('Automóvel'),
  ('Motocicleta'),
  ('Carreta');

-- TABELA AUTOMOVEL --
CREATE TABLE TB_AUTOMOVEL (
  ID_AUTOMOVEL INT AUTO_INCREMENT  PRIMARY KEY,
  MARCA_AUTOMOVEL VARCHAR(250) NOT NULL,
  MODELO_AUTOMOVEL VARCHAR(250) NOT NULL,
  COR_AUTOMOVEL VARCHAR(50) NOT NULL
);

INSERT INTO TB_AUTOMOVEL (MARCA_AUTOMOVEL, MODELO_AUTOMOVEL, COR_AUTOMOVEL) VALUES
  ('Fiat', 'Siena', 'Vermelho'),
  ('Lamborghini', 'Lamborghini', 'Amarelo'),
  ('Audi', 'Audi r8', 'Azul');
 

-- TABELA PEÇAS --
CREATE TABLE TB_PECAS (
  ID_PECAS INT AUTO_INCREMENT  PRIMARY KEY,
  PECAS_DESCRICAO VARCHAR(250) NOT NULL,
  PECAS_PRECO DECIMAL(20, 2) NOT NULL
); 

INSERT INTO TB_PECAS (PECAS_DESCRICAO, PECAS_PRECO) VALUES
  ('Rodas', 5.0),
  ('Oleo', 5.0);

-- TABELA DEFEITOS --
CREATE TABLE TB_DEFEITOS (
  ID_DEFEITOS INT AUTO_INCREMENT  PRIMARY KEY,
  DESCRICAO_DEFEITOS VARCHAR(250) NOT NULL
); 

INSERT INTO TB_DEFEITOS (DESCRICAO_DEFEITOS) VALUES
  ('Problema roda traseira'), 
  ('Problema porta dianteira');

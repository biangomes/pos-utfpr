/**
* BEATRIZ NASCIMENTO GOMES 
**/
CREATE TABLE IF NOT EXISTS `Departamento` (
  `codDepartamento` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`codDepartamento`))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Funcionario` (
  `codFuncionario` INT NOT NULL,
  `nome` VARCHAR(255) NULL,
  `qtdDependentes` INT NULL,
  `salario` REAL NULL,
  `cargo` VARCHAR(60) NULL,
  `Departamento_codDepartamento` INT NOT NULL,
  PRIMARY KEY (`codFuncionario`),
  INDEX `fk_Funcionario_Departamento_idx` (`Departamento_codDepartamento` ASC) VISIBLE,
  CONSTRAINT `fk_Funcionario_Departamento`
    FOREIGN KEY (`Departamento_codDepartamento`)
    REFERENCES `Departamento` (`codDepartamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Popular `Departamento`
-- -----------------------------------------------------
INSERT INTO departamento (nome) values ('Desenvolvimento'), ('Marketing'), ('Infraestrutura');
SELECT * FROM departamento;
DESCRIBE departamento;
-- -----------------------------------------------------
-- Popular `Funcionario`
-- -----------------------------------------------------
DESCRIBE funcionario;
ALTER TABLE atividade2.funcionario MODIFY COLUMN codFuncionario int auto_increment NOT NULL;
INSERT INTO funcionario (nome, qtdDependentes, salario, cargo, Departamento_codDepartamento)
VALUES ('Beatriz', 0, 6000.00, 'Desenvolvedora Jr', 1),
	   ('Andrea', 1, 5000.00, 'Analista de Marketing Pleno', 2),
       ('Bruno', 0, 5000.00, 'Analista de Infraestrutura Pleno', 3),
       ('Fabio', 3, 6000.00, 'Desenvolvedor Jr', 1);
SELECT * FROM funcionario;
-- -----------------------------------------------------
-- Questao 4.a
-- -----------------------------------------------------
CREATE VIEW DepartamentoComMaisFuncionarios
AS (SELECT d.nome, count(f.codFuncionario) AS funcionarios
	FROM departamento d 
	LEFT JOIN funcionario f ON d.codDepartamento = f.Departamento_codDepartamento 
	GROUP BY d.nome
	ORDER BY funcionarios DESC
	LIMIT 1);

SELECT * FROM DepartamentoComMaisFuncionarios;
-- -----------------------------------------------------
-- Questao 4.b
-- -----------------------------------------------------
SELECT d.nome AS nome_departamento, COUNT(f.codFuncionario) AS quantidade_funcionarios_com_dependentes
FROM Funcionario f
JOIN Departamento d ON f.Departamento_codDepartamento = d.codDepartamento
WHERE f.qtdDependentes > 0 OR f.qtdDependentes IS NULL
GROUP BY d.nome
ORDER BY quantidade_funcionarios_com_dependentes ASC
LIMIT 1;
-- -----------------------------------------------------
-- Questao 4.c
-- -----------------------------------------------------
SELECT d.nome AS nome_departamento, f.nome AS nome_funcionario
FROM Funcionario f
JOIN Departamento d ON f.Departamento_codDepartamento = d.codDepartamento
WHERE d.nome LIKE 'DIR%';
-- -----------------------------------------------------
-- Questao 4.d
-- -----------------------------------------------------
SELECT f.nome AS nome_funcionario, d.nome AS nome_departamento
FROM Funcionario f
JOIN Departamento d ON f.Departamento_codDepartamento = d.codDepartamento
WHERE f.salario = (
    SELECT MAX(salario) FROM Funcionario
);
-- -----------------------------------------------------
-- Questao 4.e
-- -----------------------------------------------------
SELECT d.nome AS nome_departamento, f.nome AS nome_funcionario
FROM Funcionario f
JOIN Departamento d ON f.Departamento_codDepartamento = d.codDepartamento
WHERE f.cargo = 'Gerente'
ORDER BY d.nome, f.nome;
-- -----------------------------------------------------
-- Questao 5.a
-- -----------------------------------------------------
-- Criar usuário 'funcionario' com acesso limitado
CREATE USER 'funcionario'@'localhost' IDENTIFIED BY 'funcionario123';
-- Conceder permissões limitadas para o usuário 'funcionario'
GRANT SELECT ON atividade2.* TO 'funcionario'@'localhost';
-- -----------------------------------------------------
-- Questao 5.b
-- -----------------------------------------------------
-- Criar usuário 'gerente' com acesso completo
CREATE USER 'gerente'@'localhost' IDENTIFIED BY 'gerente123';
-- Conceder permissões completas para o usuário 'gerente'
GRANT ALL PRIVILEGES ON atividade2.* TO 'gerente'@'localhost';
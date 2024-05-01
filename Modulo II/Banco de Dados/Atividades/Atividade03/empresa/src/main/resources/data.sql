INSERT INTO departamento (nome) values ('Desenvolvimento'), ('Marketing'), ('Infraestrutura');

INSERT INTO funcionario (nome, qtd_dependentes, salario, cargo, departamento_fk)
VALUES ('Beatriz', 0, 6000.00, 'Desenvolvedora Jr', 1),
       ('Andrea', 1, 5000.00, 'Analista de Marketing Pleno', 2),
       ('Bruno', 0, 5000.00, 'Analista de Infraestrutura Pleno', 3),
       ('Fabio', 3, 6000.00, 'Desenvolvedor Jr', 1);
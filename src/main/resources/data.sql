CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, username VARCHAR(255), role VARCHAR(255));
INSERT INTO users (id, username, role) VALUES (1, 'cleydson_admin', 'ADMIN');
INSERT INTO users (id, username, role) VALUES (2, 'fatec_user', 'USER');
INSERT INTO users (id, username, role) VALUES (3, 'orientador_arana', 'PROFESSOR');
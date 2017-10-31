DROP SCHEMA IF EXISTS test_database;

CREATE SCHEMA IF NOT EXISTS test_database
CHARACTER SET utf8;

USE test_database;

CREATE TABLE greeting (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, greeting VARCHAR(255) NOT NULL);

INSERT INTO greeting (greeting) VALUES ('Hellow, World!');

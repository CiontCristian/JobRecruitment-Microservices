
DROP TABLE IF EXISTS test_data;

CREATE TABLE test_data (
    id int PRIMARY KEY AUTO_INCREMENT,
    str1 varchar(20)
);

INSERT INTO test_data(id, str1) VALUES (1, 'A');
INSERT INTO test_data(id, str1) VALUES (2, 'B');
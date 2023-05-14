DROP TABLE IF EXISTS students;
CREATE TABLE IF NOT EXISTS students
(
    id        SERIAL NOT NULL PRIMARY KEY,
    firstname VARCHAR(50),
    lastname  VARCHAR(50),
    age       INTEGER
);
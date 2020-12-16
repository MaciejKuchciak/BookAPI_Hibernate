CREATE DATABASE IF NOT EXISTS book
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS books
(
    id        bigint not null auto_increment,
    author    varchar(255),
    isbn      varchar(255),
    publisher varchar(255),
    title     varchar(255),
    type      varchar(255),
    primary key (id)
) engine = InnoDB;
create table if not exists parts (
    id bigint NOT NULL PRIMARY KEY auto_increment,
    name varchar(255),
    price double
);
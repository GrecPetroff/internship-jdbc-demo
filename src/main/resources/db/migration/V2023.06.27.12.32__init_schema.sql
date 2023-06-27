create sequence if not exists SEQ_RELEASE start 1 increment 1;

create table employee (
    id                      BIGINT DEFAULT NEXTVAL('SEQ_RELEASE') NOT NULL,
    first_name                   VARCHAR(20),
    last_name                   VARCHAR(20),
    primary key (id)
);

-- create table EMPLOYEES(
--     id bigint not null ,
--     name varchar(255),
--     primary key (id)
-- );
CREATE TABLE IF NOT EXISTS public.EMPLOYEES (
                                                id BIGINT NOT NULL,
                                                name VARCHAR(255),
    PRIMARY KEY (id)
    );
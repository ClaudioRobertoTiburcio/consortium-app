CREATE TABLE person (
    name        varchar NOT NULL,
    id          uuid    NOT NULL,
    address     varchar NOT NULL,
    city        varchar NOT NULL,
    district    varchar NULL,
    postal_code varchar NOT NULL,
    CONSTRAINT person_pk PRIMARY KEY (id)
);
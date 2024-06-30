CREATE TABLE consortium_assembly (
    id            uuid    NOT NULL,
    assembly_date date    NOT NULL,
    reunion       numeric NOT NULL,
    "group"       uuid    NOT NULL,
    CONSTRAINT consortium_assembly_pk PRIMARY KEY (id),
    CONSTRAINT consortium_assembly_group_fk FOREIGN KEY ("group") REFERENCES consortium_group (id)
);

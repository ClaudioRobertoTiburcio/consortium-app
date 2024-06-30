CREATE TABLE consortium_group (
    id                   uuid    NOT NULL,
    group_value          numeric   NOT NULL,
    installment_quantity numeric NOT NULL,
    installment_value    numeric   NOT NULL,
    CONSTRAINT group_pk PRIMARY KEY (id)
);

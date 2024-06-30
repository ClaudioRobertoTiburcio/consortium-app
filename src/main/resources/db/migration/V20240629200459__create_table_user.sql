CREATE TABLE consortium_user (
    id                uuid                 NOT NULL,
    consortium_number numeric              NOT NULL,
    situation         boolean DEFAULT true NOT NULL,
    person_id            uuid                 NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id),
    CONSTRAINT person_fk FOREIGN KEY (person_id) REFERENCES person (id)
);


CREATE TABLE group_user (
    user_id  uuid,
    group_id uuid,
    CONSTRAINT group_user_user_fk FOREIGN KEY (user_id) REFERENCES consortium_user (id),
    CONSTRAINT group_user_group_fk FOREIGN KEY (group_id) REFERENCES consortium_group (id)
);

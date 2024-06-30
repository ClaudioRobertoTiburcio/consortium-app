package org.robsprojetcs.consortium.generic.model;

import java.util.UUID;

public interface GenericEntity<T> {

    void update(T source);

    UUID getId();
}

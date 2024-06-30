package org.robsprojetcs.consortium.generic.crud;

import org.robsprojetcs.consortium.generic.model.GenericEntity;

import java.util.Optional;

public interface GenericService<T extends GenericEntity<T>, ID> {

    Iterable<T> getAll();
    Optional<T> getById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}

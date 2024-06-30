package org.robsprojetcs.consortium.generic.crud;


import org.robsprojetcs.consortium.generic.exception.NotFoundException;
import org.robsprojetcs.consortium.generic.model.GenericEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Implementação da interface @GenericService
 * Service que realiza as operações básicas do crud para a entidade fornecida
 * @param <T> entidade que utilizará a implementação
 * @param <ID> identificador da entidade
 */
public abstract class GenericServiceImpl<T extends GenericEntity<T>, ID> implements GenericService<T, ID> {


    private final CrudRepository<T, ID> repository;

    protected GenericServiceImpl(CrudRepository<T, ID> crudRepository) {
        this.repository = crudRepository;
    }

    @Override
    public Iterable<T> getAll() {
        return repository.findAll();
    }
    @Override
    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }
    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(ID id, T entity) {
        Optional<T> optionalEntity = repository.findById(id);
        T persistedEntity = optionalEntity.orElseThrow(() -> new NotFoundException("Entity not found" + id));
        persistedEntity.update(entity);
        return repository.save(persistedEntity);
    }

    @Override
    public void delete(ID id) {
        repository.deleteById(id);
    }

}

package org.robsprojetcs.consortium.generic.controller;

import org.robsprojetcs.consortium.generic.crud.GenericService;
import org.robsprojetcs.consortium.generic.model.GenericEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * Controller genérico com as operações básicas de uma API Create, Retrieve, Update, Delete e List
 *
 * @param <T> entidade que utilizará a implementação
 * @param <ID> identificador da entidade
 */
public abstract class GenericController<T extends GenericEntity<T>, ID>  {

    private final GenericService<T, ID> genericService;

    protected GenericController(GenericService<T, ID> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        return new ResponseEntity<>(genericService.create(entity), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> retrieve(@PathVariable ID id) {
        Optional<T> optionalEntity = genericService.getById(id);
        return optionalEntity.map(entity -> new ResponseEntity<>(entity, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable("id") ID id, @RequestBody T entity) {
        return new ResponseEntity<>(genericService.update(id, entity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<T> delete(@PathVariable("id") ID id) {
        genericService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping()
    public ResponseEntity<Iterable<T>> list() {
        return new ResponseEntity<>(genericService.getAll(), HttpStatus.OK);
    }

}

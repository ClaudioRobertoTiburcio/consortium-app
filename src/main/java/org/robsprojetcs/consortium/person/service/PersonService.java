package org.robsprojetcs.consortium.person.service;

import org.robsprojetcs.consortium.generic.crud.GenericServiceImpl;
import org.robsprojetcs.consortium.person.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService extends GenericServiceImpl<PersonEntity, UUID> {

    public PersonService(CrudRepository<PersonEntity, UUID> crudRepository) {
        super(crudRepository);
    }
}

package org.robsprojetcs.consortium.consortiumassembly.service;

import org.robsprojetcs.consortium.consortiumassembly.model.ConsortiumAssemblyEntity;
import org.robsprojetcs.consortium.generic.crud.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsortiumAssemblyService extends GenericServiceImpl<ConsortiumAssemblyEntity, UUID> {

    public ConsortiumAssemblyService(CrudRepository<ConsortiumAssemblyEntity, UUID> crudRepository) {
        super(crudRepository);
    }
}

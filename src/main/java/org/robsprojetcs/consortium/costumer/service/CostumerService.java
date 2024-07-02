package org.robsprojetcs.consortium.costumer.service;

import org.robsprojetcs.consortium.costumer.model.CostumerEntity;
import org.robsprojetcs.consortium.generic.crud.GenericServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CostumerService extends GenericServiceImpl<CostumerEntity, UUID> {

    protected CostumerService(CrudRepository<CostumerEntity, UUID> crudRepository) {
        super(crudRepository);
    }
}

package org.robsprojetcs.consortium.costumer.controller;

import org.robsprojetcs.consortium.costumer.model.CostumerEntity;
import org.robsprojetcs.consortium.generic.controller.GenericController;
import org.robsprojetcs.consortium.generic.crud.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/costumer")
public class CostumerController extends GenericController<CostumerEntity, UUID> {

    protected CostumerController(GenericService<CostumerEntity, UUID> genericService) {
        super(genericService);
    }
}

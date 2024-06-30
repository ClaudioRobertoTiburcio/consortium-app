package org.robsprojetcs.consortium.consortiumassembly.controller;

import org.robsprojetcs.consortium.consortiumassembly.model.ConsortiumAssemblyEntity;
import org.robsprojetcs.consortium.generic.controller.GenericController;
import org.robsprojetcs.consortium.generic.crud.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("consortiumAssembly")
public class ConsortiumAssemblyController extends GenericController<ConsortiumAssemblyEntity, UUID> {

    protected ConsortiumAssemblyController(GenericService<ConsortiumAssemblyEntity, UUID> genericService) {
        super(genericService);
    }
}

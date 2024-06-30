package org.robsprojetcs.consortium.person.controller;

import org.robsprojetcs.consortium.generic.controller.GenericController;
import org.robsprojetcs.consortium.generic.crud.GenericService;
import org.robsprojetcs.consortium.group.model.GroupEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController extends GenericController<GroupEntity, UUID> {

    protected PersonController(GenericService<GroupEntity, UUID> genericService) {
        super(genericService);
    }
}

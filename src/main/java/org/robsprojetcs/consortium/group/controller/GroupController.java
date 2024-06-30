package org.robsprojetcs.consortium.group.controller;

import org.robsprojetcs.consortium.generic.controller.GenericController;
import org.robsprojetcs.consortium.generic.crud.GenericService;
import org.robsprojetcs.consortium.group.model.GroupEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/group")
public class GroupController extends GenericController<GroupEntity, UUID> {

    protected GroupController(GenericService<GroupEntity, UUID> genericService) {
        super(genericService);
    }
}

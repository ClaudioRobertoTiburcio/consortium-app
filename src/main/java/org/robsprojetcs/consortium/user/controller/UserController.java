package org.robsprojetcs.consortium.user.controller;

import org.robsprojetcs.consortium.generic.controller.GenericController;
import org.robsprojetcs.consortium.generic.crud.GenericService;
import org.robsprojetcs.consortium.user.model.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController extends GenericController<UserEntity, UUID> {


    protected UserController(GenericService<UserEntity, UUID> genericService) {
        super(genericService);
    }
}

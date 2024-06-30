package org.robsprojetcs.consortium.user.service;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.robsprojetcs.consortium.generic.crud.GenericServiceImpl;
import org.robsprojetcs.consortium.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Setter(onMethod_ = @Autowired)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService extends GenericServiceImpl<UserEntity, UUID> {

    public UserService(CrudRepository<UserEntity, UUID> crudRepository) {
        super(crudRepository);
    }
}

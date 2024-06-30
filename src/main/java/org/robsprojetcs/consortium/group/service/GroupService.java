package org.robsprojetcs.consortium.group.service;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.robsprojetcs.consortium.generic.crud.GenericServiceImpl;
import org.robsprojetcs.consortium.group.model.GroupEntity;
import org.robsprojetcs.consortium.group.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Setter(onMethod_ = @Autowired)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GroupService extends GenericServiceImpl<GroupEntity, UUID> {

    public GroupService(GroupRepository groupRepository) {
        super(groupRepository);
    }
}

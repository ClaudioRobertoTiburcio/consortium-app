package org.robsprojetcs.consortium.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.robsprojetcs.consortium.generic.model.GenericEntity;
import org.robsprojetcs.consortium.group.model.GroupEntity;
import org.robsprojetcs.consortium.person.model.PersonEntity;


import java.util.List;
import java.util.UUID;

@Entity(name = "consortium_user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements GenericEntity<UserEntity> {

    @Id
    private UUID id;
    @ManyToMany
    private List<GroupEntity> group;
    private int consortiumNumber;
    private boolean situation;
    @OneToOne
    private PersonEntity person;

    @Override
    public void update(UserEntity source) {
        this.consortiumNumber = source.getConsortiumNumber();
        this.situation = source.isSituation();
        this.person.update(source.getPerson());
    }
}



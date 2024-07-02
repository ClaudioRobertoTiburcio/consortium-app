package org.robsprojetcs.consortium.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.robsprojetcs.consortium.generic.model.GenericEntity;
import org.robsprojetcs.consortium.person.model.PersonEntity;


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

    @OneToOne
    private PersonEntity person;

    @NotNull(message = "email must not be null")
    private String email;

    private String password;

    private boolean situation;

    @Override
    public void update(UserEntity source) {
        this.person.update(source.getPerson());
        this.email = source.getEmail();
    }
}



package org.robsprojetcs.consortium.person.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.robsprojetcs.consortium.generic.model.GenericEntity;

import java.util.UUID;

@Entity(name = "person")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity implements GenericEntity<PersonEntity> {

    @Id
    private UUID id;

    @NotNull(message = "name must not be null")
    private String name;

    @NotNull(message = "address must not be null")
    private String address;

    @NotNull(message = "city must not be null")
    private String city;

    @NotNull(message = "postalCode must not be null")
    private String postalCode;

    private String district;

    @Override
    public void update(PersonEntity source) {
        this.name = source.getName();
        this.address = source.getAddress();
        this.city = source.getCity();
        this.postalCode = source.getPostalCode();
        this.district = source.getDistrict();
    }
}

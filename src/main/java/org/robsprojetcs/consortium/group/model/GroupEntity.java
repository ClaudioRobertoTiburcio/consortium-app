package org.robsprojetcs.consortium.group.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.robsprojetcs.consortium.generic.model.GenericEntity;

import java.util.UUID;

@Entity(name = "consortium_group")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupEntity implements GenericEntity<GroupEntity> {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull(message = "groupValue must not be null")
    private float groupValue;

    @NotNull(message = "installmentQuantity must not be null")
    private int installmentQuantity;

    @NotNull(message = "installmentValue must not be null")
    private float installmentValue;


    @Override
    public void update(GroupEntity source) {
        this.groupValue = source.getGroupValue();
        this.installmentQuantity = source.getInstallmentQuantity();
        this.installmentValue = source.getInstallmentValue();
    }
}

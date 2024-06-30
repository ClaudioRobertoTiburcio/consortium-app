package org.robsprojetcs.consortium.consortiumassembly.model;

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
import org.robsprojetcs.consortium.group.model.GroupEntity;

import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "consortium_assembly")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsortiumAssemblyEntity implements GenericEntity<ConsortiumAssemblyEntity> {

    @Id
    private UUID id;

    @OneToOne
    @NotNull(message = "group must not be null")
    private GroupEntity group;

    @NotNull(message = "assemblyDate must not be null")
    private LocalDate assemblyDate;

    @NotNull(message = "reunion must not be null")
    private int reunion;


    @Override
    public void update(ConsortiumAssemblyEntity source) {
        this.group.update(source.getGroup());
        this.assemblyDate = source.getAssemblyDate();
        this.reunion = source.getReunion();
    }
}

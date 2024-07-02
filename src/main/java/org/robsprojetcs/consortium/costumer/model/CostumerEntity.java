package org.robsprojetcs.consortium.costumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.robsprojetcs.consortium.generic.model.GenericEntity;
import org.robsprojetcs.consortium.group.model.GroupEntity;

import java.util.List;
import java.util.UUID;

@Entity(name = "costumer")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CostumerEntity implements GenericEntity<CostumerEntity> {

    @Id
    private UUID id;

    @ManyToMany
    @NotNull(message = "user must have at least one group")
    private List<GroupEntity> group;

    @NotNull(message = "consortiumNumber must not be null")
    private int consortiumNumber;

    /**
     * Método usado para atulizar a entidade Costumer, sempre limpa todos os grupos já salvos fazendo com que,
     * grupos que não foram informados durante a atualização sejam removidos, mantém os que já existem e adiciona novos
     * @param source entidade atualizada
     */
    @Override
    public void update(CostumerEntity source) {
        this.group.clear();
        this.group.addAll(source.getGroup());
        this.consortiumNumber = source.consortiumNumber;
    }
}

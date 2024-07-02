package org.robsprojetcs.consortium.costumer.repository;

import org.robsprojetcs.consortium.costumer.model.CostumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CostumerRepository extends JpaRepository<CostumerEntity, UUID> {
}

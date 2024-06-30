package org.robsprojetcs.consortium.consortiumassembly.repository;

import org.robsprojetcs.consortium.consortiumassembly.model.ConsortiumAssemblyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsortiumAssemblyRepository extends JpaRepository<ConsortiumAssemblyEntity, UUID> {
}

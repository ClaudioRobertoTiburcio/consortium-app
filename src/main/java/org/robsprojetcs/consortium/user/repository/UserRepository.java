package org.robsprojetcs.consortium.user.repository;

import org.robsprojetcs.consortium.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface UserRepository extends JpaRepository<UserEntity, UUID> {

}

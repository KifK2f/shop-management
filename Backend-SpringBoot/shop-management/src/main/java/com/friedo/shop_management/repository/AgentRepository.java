package com.friedo.shop_management.repository;

import com.friedo.shop_management.model.Agent;
import com.friedo.shop_management.model.SexeType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    Optional<Agent> findByLastName(String lastName);
    Optional<Agent> findByFirstName(String firstName);
    Optional<Agent> findBySex(SexeType sex);
}

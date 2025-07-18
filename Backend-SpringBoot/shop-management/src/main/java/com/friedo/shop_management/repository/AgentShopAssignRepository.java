package com.friedo.shop_management.repository;

import com.friedo.shop_management.model.AgentShopAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AgentShopAssignRepository extends JpaRepository<AgentShopAssignment, Long> {
    List<AgentShopAssignment> findAllByAgentLastName(String lastNameAgent);
    List<AgentShopAssignment> findAllByAgentFirstName(String firstNameAgent);
    List<AgentShopAssignment> findAllByAgentLastNameAndFirstName(String firstNameAgent);
    List<AgentShopAssignment> findAllByPartenaireNom(String nomPartenaire);
}

package com.friedo.shop_management.service;

import com.friedo.shop_management.dto.AgentShopAssignDto;

import java.time.LocalDate;
import java.util.List;

public interface IAgentShopAssignService {
    AgentShopAssignDto save(AgentShopAssignDto agentShopAssignDto);
    AgentShopAssignDto findById(Long id);
    AgentShopAssignDto findByAssignmentDate(LocalDate assignmentDate);
    List<AgentShopAssignDto> findAll();
    List<AgentShopAssignDto> findAllByAgentLastName(String lastName);
    List<AgentShopAssignDto> findAllByAgentFirstName(String firstName);
    List<AgentShopAssignDto> findAllByAgentLastNameAndFirstName(String lastName,String firstName);
    List<AgentShopAssignDto> findAllByShopName(String name);
    void deleteById(Long id);
}

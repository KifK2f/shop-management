package com.friedo.shop_management.service;


import com.friedo.shop_management.dto.AgentDto;
import com.friedo.shop_management.model.SexeType;

public interface IAgentService {
    AgentDto save(AgentDto shopDto);
    AgentDto findById(Long id);
    AgentDto findByLastName(String lastName);
    AgentDto findByFirstName(String firstName);
    AgentDto findBySex(SexeType sex);
    void deleteById(Long id);
}

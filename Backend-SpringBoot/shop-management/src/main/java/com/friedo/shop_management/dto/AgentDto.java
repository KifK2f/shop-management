package com.friedo.shop_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.friedo.shop_management.model.Agent;
import com.friedo.shop_management.model.AgentShopAssignment;
import com.friedo.shop_management.model.SexeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentDto {
    private Long id;

    private String lastName;

    private String firstName;

    private SexeType sex;

    @JsonIgnore
    private List<AgentShopAssignment> agentShopAssignments;

    public static AgentDto fromEntity(Agent agent){
        if(agent==null){
            return null;
        }
        return AgentDto.builder()
                .id(agent.getId())
                .lastName(agent.getLastName())
                .firstName(agent.getFirstName())
                .sex(agent.getSex())
                .build();
    }

    public static Agent toEntity(AgentDto agentDto){
        if(agentDto==null){
            return null;
        }
        Agent agent= new Agent();
        agent.setId(agentDto.getId());
        agent.setLastName(agentDto.getLastName());
        agent.setFirstName(agentDto.getFirstName());
        agent.setSex(agentDto.getSex());
        return agent;
    }
}

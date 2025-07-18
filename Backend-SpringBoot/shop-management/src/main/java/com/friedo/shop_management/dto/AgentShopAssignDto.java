package com.friedo.shop_management.dto;

import com.friedo.shop_management.model.AgentShopAssignment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentShopAssignDto {
    private Long id;

    private LocalDate assignmentDate;

    private AgentDto agent;

    private ShopDto shop;

    public static AgentShopAssignDto fromEntity(AgentShopAssignment agentShopAssignment){
        if(agentShopAssignment==null){
            return null;
        }
        return AgentShopAssignDto.builder()
                .id(agentShopAssignment.getId())
                .assignmentDate(agentShopAssignment.getAssignmentDate())
                .agent(AgentDto.fromEntity(agentShopAssignment.getAgent()))
                .shop(ShopDto.fromEntity(agentShopAssignment.getShop()))
                .build();
    }

    public static AgentShopAssignment toEntity(AgentShopAssignDto agentShopAssignmentDto){
        if(agentShopAssignmentDto==null){
            return null;
        }
        AgentShopAssignment agentShopAssignment= new AgentShopAssignment();
        agentShopAssignment.setId(agentShopAssignmentDto.getId());
        agentShopAssignment.setAssignmentDate(agentShopAssignmentDto.getAssignmentDate());
        agentShopAssignment.setAgent(AgentDto.toEntity(agentShopAssignmentDto.getAgent()));
        agentShopAssignment.setShop(ShopDto.toEntity(agentShopAssignmentDto.getShop()));
        return agentShopAssignment;
    }

    public static List<AgentShopAssignDto> fromEntities(List<AgentShopAssignment> agentShopAssignments){
        if(agentShopAssignments==null){
            return null;
        }
        List<AgentShopAssignDto> agentShopAssignmentDtoS= new ArrayList<>();
        for(AgentShopAssignment agentShopAssignment:agentShopAssignments){
            agentShopAssignmentDtoS.add(AgentShopAssignDto.builder()
                    .id(agentShopAssignment.getId())
                    .assignmentDate(agentShopAssignment.getAssignmentDate())
                    .agent(AgentDto.fromEntity(agentShopAssignment.getAgent()))
                    .shop(ShopDto.fromEntity(agentShopAssignment.getShop()))
                    .build());
        }


        return agentShopAssignmentDtoS;
    }

    public static List<AgentShopAssignment> toEntities(List<AgentShopAssignDto> agentShopAssignmentDtoS){
        if(agentShopAssignmentDtoS==null){
            return null;
        }
        List<AgentShopAssignment> agentShopAssignments= new ArrayList<>();
        for (AgentShopAssignDto agentShopAssignmentDto:agentShopAssignmentDtoS){
            agentShopAssignments.add(AgentShopAssignment.builder()
                    .assignmentDate(agentShopAssignmentDto.getAssignmentDate())
                    .agent(AgentDto.toEntity(agentShopAssignmentDto.getAgent()))
                    .shop(ShopDto.toEntity(agentShopAssignmentDto.getShop()))
                    .build());
        }
        return agentShopAssignments;
    }
    
}

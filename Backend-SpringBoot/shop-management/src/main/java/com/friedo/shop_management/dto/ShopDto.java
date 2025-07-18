package com.friedo.shop_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.friedo.shop_management.model.AgentShopAssignment;
import com.friedo.shop_management.model.Shop;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopDto {
    private Long id;

    private String name;

    private String description;

    @JsonIgnore
    private List<AgentShopAssignment> agentShopAssignments;

    public static ShopDto fromEntity(Shop shop){
        if(shop==null){
            return null;
        }
        return ShopDto.builder()
                .id(shop.getId())
                .name(shop.getName())
                .description(shop.getDescription())
                .build();
    }

    public static Shop toEntity(ShopDto shopDto){
        if(shopDto==null){
            return null;
        }
        Shop shop= new Shop();
        shop.setId(shopDto.getId());
        shop.setName(shopDto.getName());
        shop.setDescription(shopDto.getDescription());
        return shop;
    }
    
}

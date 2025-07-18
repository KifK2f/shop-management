package com.friedo.shop_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "boutiques")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "shop")
    private List<AgentShopAssignment> agentShopAssignments;
}

package com.friedo.shop_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agent_commercial")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String lastName;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "sexe")
    @Enumerated(EnumType.STRING)
    private SexeType sex;

    @OneToMany(mappedBy = "agent")
    private List<AgentShopAssignment> agentShopAssignments;

}

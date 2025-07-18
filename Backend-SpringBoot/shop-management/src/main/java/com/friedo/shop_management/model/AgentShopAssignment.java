package com.friedo.shop_management.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "agent_boutique")
public class AgentShopAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_affectation")
    private LocalDate assignmentDate;

    //Plusieers affectation  pour 1 agent
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "boutique_id")
    private Shop shop;
}

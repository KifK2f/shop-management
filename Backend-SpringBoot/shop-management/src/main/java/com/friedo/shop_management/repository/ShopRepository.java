package com.friedo.shop_management.repository;

import com.friedo.shop_management.model.Agent;
import com.friedo.shop_management.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    Optional<Agent> findByName(String name);
    Optional<Agent> findByDescription(String description);

}

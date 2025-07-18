package com.friedo.shop_management.service;

import com.friedo.shop_management.dto.ShopDto;

public interface IShopService {
    ShopDto save(ShopDto shopDto);
    ShopDto findById(Long id);
    ShopDto findByName(String nom);
    ShopDto findByDescription(String description);
    void deleteById(Long id);
}

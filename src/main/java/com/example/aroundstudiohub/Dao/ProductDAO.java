package com.example.aroundstudiohub.Dao;

import com.example.aroundstudiohub.Entity.ProductEntity;

import java.util.Optional;


public interface ProductDAO {
   ProductEntity saveProduct(ProductEntity productEntity);

    Optional<ProductEntity> getProduct(String productId);
}

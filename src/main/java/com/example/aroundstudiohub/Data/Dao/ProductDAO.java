package com.example.aroundstudiohub.Data.Dao;

import com.example.aroundstudiohub.Data.Entity.ProductEntity;

import java.util.Optional;


public interface ProductDAO {


   ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}

package com.example.aroundstudiohub.Dao;

import com.example.aroundstudiohub.Entity.ProductEntity;



public interface ProductDAO {
   ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}

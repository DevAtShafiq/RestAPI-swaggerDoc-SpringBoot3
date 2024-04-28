package com.example.aroundstudiohub.Data.Dao.impl;

import com.example.aroundstudiohub.Data.Entity.ProductEntity;
import com.example.aroundstudiohub.Data.Dao.ProductDAO;
import com.example.aroundstudiohub.Data.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductDAOImpl implements ProductDAO {
    ProductRepository productRepository;
    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {

    productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
         ProductEntity productEntity = productRepository.getById(productId);
         return productEntity;
    }
}

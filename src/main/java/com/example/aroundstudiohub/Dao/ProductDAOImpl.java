package com.example.aroundstudiohub.Dao;

import com.example.aroundstudiohub.Entity.ProductEntity;
import com.example.aroundstudiohub.Repository.ProductRepository;
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
    public Optional<ProductEntity> getProduct(String productId) {
        return productRepository.findById(productId);

    }
}

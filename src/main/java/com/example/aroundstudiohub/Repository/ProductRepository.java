package com.example.aroundstudiohub.Repository;

import com.example.aroundstudiohub.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}

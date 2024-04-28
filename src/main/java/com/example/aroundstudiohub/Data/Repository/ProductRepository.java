package com.example.aroundstudiohub.Data.Repository;

import com.example.aroundstudiohub.Data.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}

package com.example.aroundstudiohub.Controller;

import com.example.aroundstudiohub.Dao.ProductDAOImpl;
import com.example.aroundstudiohub.Entity.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")

public class PostController {

    final
    ProductDAOImpl productDAO;

    @Autowired
    public PostController(ProductDAOImpl productDAO) {
        this.productDAO = productDAO;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveToDb(@RequestBody ProductEntity productEntity) {

        ProductEntity productEntity1 = productDAO.saveProduct(productEntity);

        return ResponseEntity.status(200).body("successfully inserted"+" "+productEntity1.getProductId());
    }


    @GetMapping("/show/{productId}")
    public Optional<ProductEntity> getProduct(@PathVariable String productId){


        long  millisecond = System.currentTimeMillis();


         Logger logger = LoggerFactory.getLogger(PostController.class);
        logger.info("[ProductController] perform{} of Around Hub API.","getProduct");
  
        Optional<ProductEntity> productEntity =productDAO.getProduct(productId);

    return productEntity;
    }

}

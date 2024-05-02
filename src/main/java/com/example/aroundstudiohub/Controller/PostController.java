package com.example.aroundstudiohub.Controller;

import com.example.aroundstudiohub.Dao.ProductDAOImpl;
import com.example.aroundstudiohub.Entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

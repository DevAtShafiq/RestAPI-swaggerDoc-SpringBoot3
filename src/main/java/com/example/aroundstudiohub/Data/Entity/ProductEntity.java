package com.example.aroundstudiohub.Data.Entity;

import com.example.aroundstudiohub.Data.Dto.ProductDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {
    @Id
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;




//    public ProductDTO toDto(){
//        return ProductDTO.builder()
//                .productId(getProductId())
//                .productName(getProductName())
//                .productPrice(getProductPrice())
//                .productStock(getProductStock())
//                .build();
//    }

}

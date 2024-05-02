package com.example.aroundstudiohub.Dto;

import com.example.aroundstudiohub.Entity.ProductEntity;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDTO {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;


    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .productId(getProductId())
                .productName(getProductName())
                .productPrice(getProductPrice())
                .productStock(getProductStock())
                .build();

    }
}

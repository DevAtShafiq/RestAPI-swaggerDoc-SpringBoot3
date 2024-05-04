package com.example.aroundstudiohub.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

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

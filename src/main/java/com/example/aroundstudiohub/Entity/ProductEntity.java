package com.example.aroundstudiohub.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    @Min(800)//won
    @Max(1000)//won
    private int productPrice;
    @NotNull
    @Min(0)//won
    @Max(1000)//won
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

package com.smartinventory.dto;

import lombok.Data;

@Data
public class CartItemDto {
    private Long id;
    private Long productId;
    private String productName;
    private double price;
    private Integer quantity;
    private Double totalPrice;

}

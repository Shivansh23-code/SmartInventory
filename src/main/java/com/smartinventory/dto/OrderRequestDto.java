package com.smartinventory.dto;


import lombok.Data;

import java.util.List;

@Data
public class OrderRequestDto {

    private Long userId;
    private List<Long> cartItemIds;
    private Double totalPrice;
    private String paymentStatus;
    private double totalAmount;
    private String paymentMethod;

}

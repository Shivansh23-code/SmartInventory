package com.smartinventory.dto;

import lombok.Data;

@Data
public class PaymentResponseDto {

    private String paymentId;
    private String orderId;
    private String status;
    private Double amount;
    private String message;
}

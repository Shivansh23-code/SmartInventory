package com.smartinventory.dto;

import lombok.Data;

@Data
public class InventoryUpdateDto {
    private Long productId;
    private Integer newQuantity;
}

package com.smartinventory.util;

import com.smartinventory.dto.*;
import com.smartinventory.entity.*;

import java.util.stream.Collectors;

public class MapperUtils {

    public static ProductDto toProductDto(Product product) {
        if (product == null) return null;

        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setCategoryName(product.getCategory() != null ? product.getCategory().getName() : null);
        dto.setAvailableQuantity(product.getAvailableQuantity());
        return dto;
    }

    public static Product toProductEntity(ProductDto dto, Category category) {
        if (dto == null) return null;

        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setCategory(category);
        product.setAvailableQuantity(dto.getAvailableQuantity());
        return product;
    }

    public static CartItemDto toCartItemDto(CartItem item) {
        if (item == null) return null;

        CartItemDto dto = new CartItemDto();
        dto.setId(item.getId());
        dto.setProductId(item.getProduct().getId());
        dto.setProductName(item.getProduct().getName());
        dto.setPrice(item.getProduct().getPrice());
        dto.setQuantity(item.getQuantity());
        dto.setTotalPrice(item.getQuantity() * item.getProduct().getPrice());
        return dto;
    }

    public static PaymentResponseDto toPaymentResponseDto(Payment payment) {
        if (payment == null) return null;

        PaymentResponseDto dto = new PaymentResponseDto();
        dto.setPaymentId(payment.getPaymentId());
        dto.setOrderId(payment.getOrder().getId().toString());
        dto.setStatus(payment.getStatus());
        dto.setAmount(payment.getAmount());
        dto.setMessage("Payment " + payment.getStatus().toLowerCase());
        return dto;
    }

    public static OrderRequestDto toOrderRequestDto(Order order) {
        if (order == null) return null;

        OrderRequestDto dto = new OrderRequestDto();
        dto.setUserId(order.getUser().getId());
        if (order.getCartItems() != null) {
            dto.setCartItemIds(order.getCartItems()
                    .stream()
                    .map(CartItem::getId)
                    .collect(Collectors.toList()));
        }
        dto.setTotalAmount(order.getTotalAmount());
        dto.setPaymentMethod(order.getPaymentMethod());
        return dto;
    }
}

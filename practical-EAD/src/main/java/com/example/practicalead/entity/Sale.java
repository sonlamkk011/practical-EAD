package com.example.practicalead.entity;

import lombok.*;

import javax.persistence.JoinColumn;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sale {
    private long saleId;
    private String saleManId;
    @JoinColumn(name = "productID")
    private Product product;
}

package com.bqt.ecommerce.payloads.request;

import com.bqt.ecommerce.entities.Product;
import lombok.Data;

@Data
public class ReceiptDetailsRequest {
    private Product product;

    private int quantity;

    private double price;
}

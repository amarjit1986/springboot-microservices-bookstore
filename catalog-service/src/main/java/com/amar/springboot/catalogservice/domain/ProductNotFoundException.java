package com.amar.springboot.catalogservice.domain;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super();
    }

    public static ProductNotFoundException forCode(String code) {
        return new ProductNotFoundException("product not found exception "+code);
    }
}

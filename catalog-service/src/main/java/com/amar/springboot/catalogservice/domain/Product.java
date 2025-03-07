package com.amar.springboot.catalogservice.domain;

import java.math.BigDecimal;

public record Product(
        String code,
        String name,
        String description,
        String imageURL,
        BigDecimal price
        ) {

}

package com.amar.springboot.catalogservice.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest(
        properties = {
                "spring.test.database.replace = none",
                "spring.datasource.url=jdbc:tc:postgresql:16-alpine///db"
        }
)
@Sql("/test-data.sql")
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void shouldGetAllProducts() {
        List<ProductEntity> products = productRepository.findAll();
    }
}

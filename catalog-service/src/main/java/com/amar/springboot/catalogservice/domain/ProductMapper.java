package com.amar.springboot.catalogservice.domain;

class ProductMapper {
    static Product toProduct(ProductEntity productEntity) {
        return  new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice()
        );
    }

    /*static ProductEntity toProductEntity(Product product) {
        return new ProductEntity(
         product.code(),
                product.name(),
                product.description(),
                product.imageURL(),
                product.price()
        )
    }*/
}

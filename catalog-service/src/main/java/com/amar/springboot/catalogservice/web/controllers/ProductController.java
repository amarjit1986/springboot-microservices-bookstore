package com.amar.springboot.catalogservice.web.controllers;

import com.amar.springboot.catalogservice.domain.PagedResult;
import com.amar.springboot.catalogservice.domain.Product;
import com.amar.springboot.catalogservice.domain.ProductNotFoundException;
import com.amar.springboot.catalogservice.domain.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    PagedResult<Product> getProducts(@RequestParam(name = "page", defaultValue = "1") int pageNo){
        return productService.getProducts(pageNo);
    }

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductsByCode(@PathVariable String code){
        return productService.getProductByCode(code).map(ResponseEntity::ok).orElseThrow(()-> ProductNotFoundException.forCode(code));
    }

}

package com.product.controllers;

import com.product.domains.Product;
import com.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "product/getall")
    public List<Product> getProdcts(){

        return productService.getProducts();
    }
    @PostMapping(value = "product/add")
    public Product addProdcts(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping(value = "product/edit/{productId}")
    public Product addProdcts(@RequestBody Product product, @PathVariable("productId") Long productId){
        product.setId(productId);
        return productService.save(product);
    }

    @DeleteMapping(value = "product/delete/{productId}")
    public Product deleteProdcts(@PathVariable("productId") Long productId){
        Product product = productService.getProduct(productId);
         productService.deleteProduct(product);
         return product;
    }
}

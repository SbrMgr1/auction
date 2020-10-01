package com.product.services;

import com.product.domains.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public Product getProduct(Long id);
    public List<Product> getProducts();
    public void deleteProduct(Product product);
}

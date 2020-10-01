package com.product.services.impl;

import com.product.domains.Product;
import com.product.repositories.ServiceRepository;
import com.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Product save(Product product) {
        return serviceRepository.save(product);
    }

    @Override
    public Product getProduct(Long id) throws NullPointerException{
        return serviceRepository.findById(id).get();
    }

    @Override
    public List<Product> getProducts() {
        return (List<Product>) serviceRepository.findAll();
    }

    @Override
    public void deleteProduct(Product product) {
        serviceRepository.delete(product);
    }
}

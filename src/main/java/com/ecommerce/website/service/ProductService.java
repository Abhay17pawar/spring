package com.ecommerce.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.website.model.Product;
import com.ecommerce.website.repo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(int Id) {
        return productRepo.findById(Id);
    }
}

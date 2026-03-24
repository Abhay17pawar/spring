package com.ecommerce.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.website.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    
    
}

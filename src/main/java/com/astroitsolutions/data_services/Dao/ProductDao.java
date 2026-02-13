package com.astroitsolutions.data_services.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import com.astroitsolutions.data_services.Entity.Product;
import com.astroitsolutions.data_services.Repository.ProductRepository;

@Component
public class ProductDao {
    @Autowired
    private ProductRepository productRepository;

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public Optional<Product> findByName(String name){
        return productRepository.findByName(name);
    }

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public void deleteByName(String name){
        productRepository.deleteByName(name);
    }

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public Product save(Product retrievedProduct) {
        return productRepository.save(retrievedProduct);
    }
}

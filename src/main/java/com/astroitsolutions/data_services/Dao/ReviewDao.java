package com.astroitsolutions.data_services.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import com.astroitsolutions.data_services.Entity.Review;
import com.astroitsolutions.data_services.Repository.ReviewRepository;

@Component
public class ReviewDao {
    @Autowired
    private ReviewRepository reviewRepository;

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public Optional<List<Review>> findAllByProductId(int productId, Pageable pageable){
        return reviewRepository.findAllByProductId(productId, pageable);
    }

    @CircuitBreaker(name = "databaseCircuitBreaker")
    public Optional<List<Review>> findAllByClientId(int productId, Pageable pageable){
        return reviewRepository.findAllByClientId(productId, pageable);
    }
}

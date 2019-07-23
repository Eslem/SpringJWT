package com.backprop.springjwt.repositories;

import com.backprop.springjwt.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, String> {

    @Override
    void delete(Products deleted);
}

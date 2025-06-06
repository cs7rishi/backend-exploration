package com.cs7rishi.mongoDB.repository;

import com.cs7rishi.mongoDB.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {

    List<Product> findByCategory(String category);

    List<Product> findByPriceBetween(double minPrice, double maxPrice);
}

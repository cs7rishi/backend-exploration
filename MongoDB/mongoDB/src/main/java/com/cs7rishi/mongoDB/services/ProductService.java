package com.cs7rishi.mongoDB.services;

import com.cs7rishi.mongoDB.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(String id);
    Product updateProduct(String id, Product product);
    void deleteProductById(String id);
}

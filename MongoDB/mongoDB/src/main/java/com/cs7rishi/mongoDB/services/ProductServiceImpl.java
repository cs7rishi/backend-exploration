package com.cs7rishi.mongoDB.services;

import com.cs7rishi.mongoDB.entity.Product;
import com.cs7rishi.mongoDB.repository.ProductRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private Gson gson;

    @Autowired
    private ProductRepository productRepository;

    public void printAllProducts(){
        System.out.println("Printing Products");
        List<Product> products = productRepository.findAll();
        for(Product p : products){
            System.out.println(gson.toJson(p));
        }
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        Optional<Product> existingProduct = productRepository.findById(id);
        return existingProduct.orElse(null);
    }

    @Override
    public Product updateProduct(String id, Product newProduct) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if(existingProduct.isPresent()){
            Product product = existingProduct.get();
            product.setName(newProduct.getName());
            product.setCategory(newProduct.getCategory());
            product.setPrice(newProduct.getPrice());
            product.setBrand(newProduct.getBrand());
            product.setSize(newProduct.getSize());
            product.setColor(newProduct.getColor());
            return product;
        }
        return null;
    }

    @Override
    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }
}

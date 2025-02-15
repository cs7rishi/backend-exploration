package com.cs7rishi.mongoDB.controller;

import com.cs7rishi.mongoDB.entity.Product;
import com.cs7rishi.mongoDB.services.ProductService;
import com.cs7rishi.mongoDB.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/")
    private Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/")
    private List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    private Product getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    private Product updateProductById(@PathVariable String id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    private void deleteProductById(@PathVariable String id){
        productService.deleteProductById(id);
    }
}

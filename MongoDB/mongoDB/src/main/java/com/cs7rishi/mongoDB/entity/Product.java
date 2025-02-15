package com.cs7rishi.mongoDB.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "products")
@Getter
@Setter
public class Product {
    @Id
    private String id;  // MongoDB automatically generates an ObjectId

    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category; // "Men" or "Women"
    private String brand;
    private List<String> size;  // ["S", "M", "L", "XL"]
    private List<String> color; // ["Black", "Blue", "Grey"]
    private double ratings;
    private LocalDateTime dateAdded; // Used for sorting latest products

    // Constructors
    public Product() {
        this.dateAdded = LocalDateTime.now(); // Default to current timestamp
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Product{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'' + ", price=" + price + ", quantity=" + quantity + ", category='" + category + '\'' + ", brand='" + brand + '\'' + ", size=" + size + ", color=" + color + ", ratings=" + ratings + ", dateAdded=" + dateAdded + '}';
    }
}

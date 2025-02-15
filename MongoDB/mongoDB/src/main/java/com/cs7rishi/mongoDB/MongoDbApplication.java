package com.cs7rishi.mongoDB;

import com.cs7rishi.mongoDB.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbApplication {
	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}
}

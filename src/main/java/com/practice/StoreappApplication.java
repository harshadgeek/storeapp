package com.practice;

import com.practice.domain.Product;
import com.practice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreappApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StoreappApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("LG", 45112.1));
        productRepository.save(new Product("Sony", 75112.1));
        productRepository.save(new Product("HP", 56112.1));
        productRepository.save(new Product("Samsung", 90112.1));
        productRepository.save(new Product("Acer", 65112.1));
    }
}

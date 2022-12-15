package com.practice.repository;


import com.practice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @RestResource(path = "name")
    List<Product> findByName(@Param("name") String name);

    @RestResource(path = "price")
    List<Product> findByPrice(@Param("price") Double price);

    @RestResource(path = "nameandprice")
    List<Product> findByNameAndPrice(
            @Param("name") String name,
            @Param("price") Double price);
}

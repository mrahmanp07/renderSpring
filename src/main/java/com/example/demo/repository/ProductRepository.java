package com.example.demo.repository;


import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = " select * from products where name like %:val% or type like %:val% ", nativeQuery = true)
    List<Product> search(@Param("val") String value);
}

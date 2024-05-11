package com.example.demo.service;


import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Product getById(Long id){
        return  productRepository.findById(id).get();
    }
    public Product update(Long id, Product product){
        product.setId(id);
        return productRepository.save(product);
    }
    public void delete(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> search(String value) {
       return productRepository.search(value);
    }
}

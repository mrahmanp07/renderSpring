package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String description;
    private String quantity;

    @CreationTimestamp
    private LocalDateTime createdAt;
//    @LastModifiedDate

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private Long createdBy;
    private Long updatedBy;
    private Boolean active = true;
    private Boolean deleted = false;
}

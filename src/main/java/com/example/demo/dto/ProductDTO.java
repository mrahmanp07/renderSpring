package com.example.demo.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String type;
    private String description;
    private String quantity;

}

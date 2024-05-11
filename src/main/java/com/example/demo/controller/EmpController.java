package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class EmpController {

    @GetMapping
    public String getAll(){
        return "Public content GET_ALL";
    }

    @GetMapping("/{id}")
    public String getById(){
        return "Public content GetById";
    }

    @DeleteMapping("/user")
    public String deleteById(){
        return "Delete By Id";
    }

    @PutMapping("/post")
    public String post(){
        return "Delete By Id";
    }



}

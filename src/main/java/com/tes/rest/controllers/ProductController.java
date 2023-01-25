package com.tes.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tes.rest.models.entity.Product;
import com.tes.rest.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService interfaceProductReport;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return interfaceProductReport.save(product);
    }

    @GetMapping 
    public Iterable<Product> findAll(){
        return interfaceProductReport.findAll();
    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id") Long id){
        return interfaceProductReport.findOne(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return interfaceProductReport.save(product);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
         interfaceProductReport.removeOne(id);
    }
} 


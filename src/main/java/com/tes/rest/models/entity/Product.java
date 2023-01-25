package com.tes.rest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product") //table name db
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment primary key id
    private Long id;

    @NotNull
    @Column (name = "product_name",nullable = false, length = 100) //edit column table
    private String name;

    @NotNull
    @Column (name = "product_description", length = 500) //edit column table
    private String description;

    @NotNull
    private double price;

    public Product() { 
    }

    //constractor table
    public Product(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //setter getter jpa
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}

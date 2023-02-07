package com.tes.rest.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//entities class that
@Entity
//table name for entities database
@Table(name = "data_file")
public class UploadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment primary key id
    private Long id;

    @Column (name = "title", length = 100)
    private String name;

    @Column (name = "description", length = 200)
    private String description;

    public UploadFile(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

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

    
}

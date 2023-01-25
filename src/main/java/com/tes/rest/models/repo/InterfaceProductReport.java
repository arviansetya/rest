package com.tes.rest.models.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tes.rest.models.entity.Product;
 
// DAO Repository spring data CrudRepository, Entity class Product dan tipe primarykey Long id 
public interface InterfaceProductReport extends CrudRepository <Product, Long>{

    List<Product> findByNameContains(String name);

}

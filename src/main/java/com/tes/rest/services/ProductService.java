package com.tes.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tes.rest.models.entity.Product;
import com.tes.rest.models.repo.InterfaceProductReport;

//Bisnis prosses productservice
@Service
@Transactional  
public class ProductService {
    //inject to repository
    @Autowired
    private InterfaceProductReport  interfaceProductReport;

    public Product save(Product product) {
        return interfaceProductReport.save(product);
    }

    public Product findOne(Long id){
        Optional<Product> product = interfaceProductReport.findById(id);
        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll(){
        return interfaceProductReport.findAll();
    }

    public void removeOne(Long id){
    interfaceProductReport.deleteById(id);  
    }
    
    public List<Product> findByName(String name){
        return interfaceProductReport.findByNameContains(name);
    }

}


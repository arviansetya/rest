package com.tes.rest.models.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tes.rest.models.entity.UploadFile;

@Repository
public interface InterfaceUploadFile extends JpaRepository <UploadFile ,Long> {
    
}

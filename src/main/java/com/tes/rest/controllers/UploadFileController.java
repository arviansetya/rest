package com.tes.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tes.rest.services.UploadFileService;

@RestController
@RequestMapping("/api")
public class UploadFileController {
    
    @Autowired
    private UploadFileService uploadFileService;

    @PostMapping("/upload")
    public void uploadCSV(@RequestParam("file") MultipartFile file ) throws Exception{
        uploadFileService.importCSV(file.getInputStream());
    }

}


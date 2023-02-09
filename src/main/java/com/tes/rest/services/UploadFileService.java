package com.tes.rest.services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes.rest.models.entity.UploadFile;
import com.tes.rest.models.repo.InterfaceUploadFile;

@Service
public class UploadFileService {
    
    @Autowired
    private InterfaceUploadFile interfaceUploadFile;


    private UploadFile mapToItem(String[] values) {
        UploadFile data = new UploadFile();
        data.setName(values[0]);
        data.setDescription(values[1]);
        return data;
    }
    public void importCSV(InputStream inputStream) throws Exception {
        List<UploadFile> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                dataList.add(mapToItem(values));
            }
            interfaceUploadFile.saveAll(dataList);
        }
    }
    
}


package com.codeClan.example.files_folder_hw.controller;

import com.codeClan.example.files_folder_hw.models.File;
import com.codeClan.example.files_folder_hw.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public List<File> getAllEmployees(){
        return fileRepository.findAll();
    }

    @GetMapping(value = "/files/{id}")
    public Optional<File> getEmployee(@PathVariable Long id){
        return fileRepository.findById(id);
    }

}

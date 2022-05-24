package com.codeClan.example.files_folder_hw.controller;

import com.codeClan.example.files_folder_hw.models.File;
import com.codeClan.example.files_folder_hw.models.Folder;
import com.codeClan.example.files_folder_hw.repository.FileRepository;
import com.codeClan.example.files_folder_hw.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public List<Folder> getAllEmployees(){
        return folderRepository.findAll();
    }

    @GetMapping(value = "/folders/{id}")
    public Optional<Folder> getEmployee(@PathVariable Long id){
        return folderRepository.findById(id);
    }

}

package com.codeClan.example.files_folder_hw.controller;

import com.codeClan.example.files_folder_hw.models.File;
import com.codeClan.example.files_folder_hw.models.User;
import com.codeClan.example.files_folder_hw.repository.FileRepository;
import com.codeClan.example.files_folder_hw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getAllEmployees(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public Optional<User> getEmployee(@PathVariable Long id){
        return userRepository.findById(id);
    }

}

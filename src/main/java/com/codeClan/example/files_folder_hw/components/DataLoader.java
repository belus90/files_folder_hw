package com.codeClan.example.files_folder_hw.components;

import com.codeClan.example.files_folder_hw.models.File;
import com.codeClan.example.files_folder_hw.models.Folder;
import com.codeClan.example.files_folder_hw.models.User;
import com.codeClan.example.files_folder_hw.repository.FileRepository;
import com.codeClan.example.files_folder_hw.repository.FolderRepository;
import com.codeClan.example.files_folder_hw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user1 = new User("Mate");
        userRepository.save(user1);

        User user2 = new User("Vivien");
        userRepository.save(user2);

        User user3 = new User("Jojo");
        userRepository.save(user3);

        User user4 = new User("Luis");
        userRepository.save(user4);

        Folder folder1 = new Folder("PDA",user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Car",user4);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Home",user3);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Insurance",user2);
        folderRepository.save(folder4);

        File file1 = new File("PDA 1.python","txt", 24,folder1);
        fileRepository.save(file1);

        File file2 = new File("Using for loop","java", 134,folder4);
        fileRepository.save(file2);

        File file3 = new File("How to create varibales","python", 12,folder3);
        fileRepository.save(file3);

        File file4 = new File("Course summary","ppt", 89,folder2);
        fileRepository.save(file4);
    }
}

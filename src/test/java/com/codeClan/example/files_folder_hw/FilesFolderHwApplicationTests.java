package com.codeClan.example.files_folder_hw;

import com.codeClan.example.files_folder_hw.models.Folder;
import com.codeClan.example.files_folder_hw.models.User;
import com.codeClan.example.files_folder_hw.repository.FileRepository;
import com.codeClan.example.files_folder_hw.repository.FolderRepository;
import com.codeClan.example.files_folder_hw.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesFolderHwApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFolder(){
		User user1 = new User("Mate");
		userRepository.save(user1);
		Folder folder1 = new Folder("pda lessons",user1);
		folderRepository.save(folder1);
	}
}

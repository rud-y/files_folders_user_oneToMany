package com.codeclan.example.files_and_folders;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositories.FileRepository;
import com.codeclan.example.files_and_folders.repositories.FolderRepository;
import com.codeclan.example.files_and_folders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

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
	public void canSaveUserAndFoldersAndFiles() {
		User user1 = new User("Andrew");
		userRepository.save(user1);

		Folder folder1 = new Folder("Important", user1);
		folderRepository.save(folder1);

		File file1 = new File("Top Secret", "txt", 10, folder1);
		fileRepository.save(file1);

	}

	@Test
	public void canAddFoldersToUser() {
		User user1 = new User("Andrew");
		userRepository.save(user1);
		Folder folder1 = new Folder("Important", user1);
		folderRepository.save(folder1);
		Folder folder2 = new Folder("Notes", user1);
		folderRepository.save(folder2);


	}


}

package com.codeclan.example.files_and_folders.components;
import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositories.FileRepository;
import com.codeclan.example.files_and_folders.repositories.FolderRepository;
import com.codeclan.example.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;


    public DataLoader() {}

    public void run(ApplicationArguments args) {

        User user1 = new User("Andrew");
        userRepository.save(user1);
        User user2 = new User("Donald");
        userRepository.save(user2);

        Folder folder1 = new Folder("Important", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Top Cases", user1);
        folderRepository.save(folder1);
        Folder folder3 = new Folder("Archive", user1);
        folderRepository.save(folder1);
        Folder folder4 = new Folder("Major", user2);
        folderRepository.save(folder1);
        Folder folder5 = new Folder("ABC", user2);
        folderRepository.save(folder1);


        File file1 = new File("Top Secret", "txt", 10, folder1);
        fileRepository.save(file1);
        File file2 = new File("Balance Sheet", "pdf", 3, folder1);
        fileRepository.save(file2);
        File file3 = new File("Pirates", "java", 20, folder2);
        fileRepository.save(file3);
        File file4 = new File("Shop Project", "ruby", 30, folder2);
        fileRepository.save(file4);
        File file5 = new File("Annotation Docs", "odt", 50, folder3);
        fileRepository.save(file5);
        File file6 = new File("Notes", "txt", 9, folder3);
        fileRepository.save(file6);

        File file7 = new File("Sales Results", "xls", 9, folder4);
        fileRepository.save(file7);
        File file8 = new File("Crime Statistics 2019", "pdf", 13, folder4);
        fileRepository.save(file8);
        File file9 = new File("Poo Finder app", "java", 35, folder4);
        fileRepository.save(file9);
        File file10 = new File("Arrays", "ruby", 11, folder5);
        fileRepository.save(file10);


    }
}

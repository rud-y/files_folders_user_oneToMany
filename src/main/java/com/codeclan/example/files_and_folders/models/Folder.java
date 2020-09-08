package com.codeclan.example.files_and_folders.models;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @JsonBackReference
    @OneToMany
    private List<File> files;


    @ManyToOne
    private User user;


    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
    }

    public Folder() {
    }

    public String getTitle() {
        return title;
    }

    public List<File> getFiles() {
        return files;
    }

    public User getUser() {
        return user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}

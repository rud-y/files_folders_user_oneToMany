package com.codeclan.example.files_and_folders.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;

    public User(String name) {
        this.name = name;
    }
    public User() {
    }


    public String getName() {
        return name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

}

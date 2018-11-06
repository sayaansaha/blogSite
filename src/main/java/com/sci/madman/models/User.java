package com.sci.madman.models;

import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Entity
public class User {
    @Id
    private Long userId;

    private String username;
    private String passwordHash;
    private String fullName;
    private Set<Post> posts = new HashSet<>();

    public User(String username){
        this.username = username;
    }

    public User(Long userId, String username, String fullName) {
        this.userId = userId;
        this.username = username;
        this.fullName = fullName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}

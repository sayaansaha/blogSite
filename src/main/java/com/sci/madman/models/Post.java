package com.sci.madman.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.xml.crypto.Data;
import java.util.Date;


@Entity
public class Post {
    @Id
    private Long id;

    private String title;
    private String body;
    private User author;
    private Date date = new Date();

    public Post(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

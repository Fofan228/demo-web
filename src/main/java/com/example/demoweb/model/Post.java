package com.example.demoweb.model;

import java.util.Date;

public class Post {
    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    private String text;
    private Integer likes;
    private Date creationDate;
}

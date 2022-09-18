package com.example.demoweb.model;

import java.util.Date;

public class Post {
    public Post(Long id, String text, Date creationDate, Integer likes) {
        this.likes = likes;
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;
}

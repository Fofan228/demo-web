package com.example.demoweb.model;

public class Post {
    public Post(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
    private String text;
    private Integer likes;
}

package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    ArrayList<Post> posts = new ArrayList<>();

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

    public ArrayList listAllPosts() {
        return posts;
    }
}

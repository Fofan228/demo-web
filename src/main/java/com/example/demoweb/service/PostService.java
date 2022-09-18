package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public PostService(){
        create("ПОСТ 1");
        create("ПОСТ 2");
        create("ПОСТ 3");
    }

    ArrayList<Post> posts = new ArrayList<>();
    private long counter = 0l;

    public void create(String text) {
        posts.add(new Post(counter, text, new Date(), 0));
        counter++;
    }

    public ArrayList<Post> listAllPosts() {
        return posts;
    }
}

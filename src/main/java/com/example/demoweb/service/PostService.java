package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList listAllPosts() {
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();

        Post post1 = new Post("текст 1", date1);
        Post post2 = new Post("текст 2", date2);
        Post post3 = new Post("текст 3", date3);

        ArrayList<Post> list = new ArrayList<>();

        list.add(post1);
        list.add(post2);
        list.add(post3);

        return list;
    }
}

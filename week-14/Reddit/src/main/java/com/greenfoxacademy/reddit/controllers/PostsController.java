package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    private final PostServiceImpl postServiceImpl;


    @Autowired
    public PostsController(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }


    @GetMapping("posts/{username}")
    public List<Post> getPosts(@RequestHeader("username") String username) {
        return postServiceImpl.getAllPosts();
    }
}

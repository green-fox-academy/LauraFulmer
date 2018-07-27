package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    private final PostServiceImpl postServiceImpl;


    @Autowired
    public PostsController(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }

    @GetMapping("posts")
    public List<Post> getPosts(@RequestHeader("username") String username) {
        return postServiceImpl.getAllPosts();
    }

    @PostMapping("addnewpost")
    public List<Post> addPost(@RequestBody (required = false) Post newPost, @RequestHeader("username") String username) {
        postServiceImpl.addNewPost(newPost);
        return postServiceImpl.getAllPosts();
    }
}

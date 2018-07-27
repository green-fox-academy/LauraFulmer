package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    void addNewPost(Post newPost);

}

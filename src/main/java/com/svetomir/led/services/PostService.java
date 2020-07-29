package com.svetomir.led.services;

import com.svetomir.led.entity.Post;

import java.util.List;

public interface PostService {
    Post Add(Post post);
    Iterable<Post> GetAllPost();
    Post GetPost(Long id);
    Post Delete(Post post);
}

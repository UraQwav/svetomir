package com.svetomir.led.controller;

import com.svetomir.led.entity.Admin;
import com.svetomir.led.entity.Post;
import com.svetomir.led.services.AdminService;
import com.svetomir.led.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/getAll")
    public Iterable<Post> getAllPost(){
        return postService.GetAllPost();
    }

    @GetMapping("/getById/{id}")
    public Post getPost(@PathVariable Long id){
        return postService.GetPost(id);
    }

    @PostMapping("/Add")
    public Post setPost(@RequestBody Post post){
        return postService.Add(post);
    }

    @PostMapping("/delete")
    public Post deletePost(@RequestBody Post post){
        return postService.Delete(post);
    }
}

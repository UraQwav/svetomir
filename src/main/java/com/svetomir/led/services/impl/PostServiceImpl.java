package com.svetomir.led.services.impl;


import com.svetomir.led.entity.Post;
import com.svetomir.led.repository.AdminRepository;
import com.svetomir.led.repository.PostRepository;
import com.svetomir.led.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post Add(Post post){
      return postRepository.save(post);
    }
    @Override
    public Iterable<Post> GetAllPost(){
        return postRepository.findAll();
    }
    @Override
    @Transactional
    public Post Delete(Post post){
        Post postIdFind = postRepository.findFirstByShortingAndTitleAndInfo(post.getShortText(), post.getTitle(), post.getInfo());
        postIdFind.getPostId();
        postRepository.deleteById(postIdFind.getPostId());
        return postIdFind;
    }
    @Override
    @Transactional
    public Post GetPost(Long id){
        return postRepository.findByPostId(id);
    }

}

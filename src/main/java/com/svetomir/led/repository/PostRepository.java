package com.svetomir.led.repository;

import com.svetomir.led.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long>{
    Post findFirstByShortingAndTitleAndInfo(String shorting, String title, String info);
    Post findByPostId(Long postId);
}

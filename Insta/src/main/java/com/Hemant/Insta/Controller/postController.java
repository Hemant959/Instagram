package com.Hemant.Insta.Controller;

import com.Hemant.Insta.Service.PostService;
import com.Hemant.Insta.model.Post;
import com.Hemant.Insta.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class postController {
    @Autowired
    PostService postService;

    @PostMapping("post/savePost")
    public String savePosts(@RequestBody Post newPost){
        return postService.savePosts(newPost);
    }

    @GetMapping("post/get")
    public String getPost(@RequestParam Post post){
        return postService.getPost(post);
    }
}

package com.Hemant.Insta.Service;

import com.Hemant.Insta.Repo.IPostRepo;
import com.Hemant.Insta.model.Post;
import com.Hemant.Insta.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo iPostRepo;

    public String savePosts(Post newPost) {
        iPostRepo.save(newPost);
        return "Post  created.";
    }

    public String getPost(Post post) {
        iPostRepo.findAll();
        return "post caught";
    }
}

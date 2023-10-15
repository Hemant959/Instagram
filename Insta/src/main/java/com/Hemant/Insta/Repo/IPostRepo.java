package com.Hemant.Insta.Repo;

import com.Hemant.Insta.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}

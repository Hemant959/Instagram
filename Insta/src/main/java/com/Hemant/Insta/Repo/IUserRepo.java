package com.Hemant.Insta.Repo;

import com.Hemant.Insta.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {

    User findByEmail(String newEmail);
}

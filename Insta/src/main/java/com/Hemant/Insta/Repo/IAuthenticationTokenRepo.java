package com.Hemant.Insta.Repo;

import com.Hemant.Insta.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Integer> {
}

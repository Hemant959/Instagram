package com.Hemant.Insta.Repo;

import com.Hemant.Insta.model.AuthenticationToken;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPtokenRepo extends JpaRepository<AuthenticationToken,Integer> {

}

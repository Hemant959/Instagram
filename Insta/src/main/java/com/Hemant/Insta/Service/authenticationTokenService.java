package com.Hemant.Insta.Service;

import com.Hemant.Insta.Repo.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class authenticationTokenService {
    @Autowired
    IAuthenticationTokenRepo authenticationTokenRepo;
}

package com.Hemant.Insta.Controller;

import com.Hemant.Insta.Service.authenticationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authenticationTokenController {
    @Autowired
    authenticationTokenService authenticationTokenService;
}

package com.Hemant.Insta.Controller;

import com.Hemant.Insta.Service.userService;
import com.Hemant.Insta.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {
    @Autowired
    userService userService;

    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User newUser){
        return userService.userSignUp(newUser);
    }
    @PostMapping("user/signIn")
    public String userSignIn(@PathVariable String email, @PathVariable String password)
    {
        return userService.userSignIn(email,password);
    }

    @PutMapping("user/update")
    public String updateUserById(@RequestParam Integer id,@RequestParam String phoneNumber){
        return userService.updateUserById(id,phoneNumber);
    }
}

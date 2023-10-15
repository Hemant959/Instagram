package com.Hemant.Insta.Service;
import com.Hemant.Insta.Repo.IUserRepo;
import com.Hemant.Insta.Service.hashingUtility.PasswordEncryptor;
import com.Hemant.Insta.model.AuthenticationToken;
import com.Hemant.Insta.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class userService {
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    PtokenService ptokenService;

    public String userSignUp(User newUser) {
        String newEmail=newUser.getEmail();
        User existingUser= iUserRepo.findByEmail(newEmail);
        if(existingUser!=null){
            return "Email already in use.";
        }
        String signUpPassword=newUser.getPassword();
        try {
            String encryptedPassword = PasswordEncryptor.encrypt(signUpPassword);

            newUser.setPassword(encryptedPassword);
            // patient table - save patient
            iUserRepo.save(newUser);
            return "Insta user registered";

        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }
    }

    public String userSignIn(String email, String password) {
        User existingUser = iUserRepo.findByEmail(email);
        if(existingUser==null){
            return "Not a valid email, Please sign up first !!!";
        }
        //password should be matched
        try {
            String encryptedPassword=PasswordEncryptor.encrypt(password);
            if(existingUser.getPassword().equals(encryptedPassword)){
                // return a token for this sign in
                AuthenticationToken token =new AuthenticationToken(existingUser);
                PtokenService.CreateToken(token);
                return token.getToken();
            }
            else{
                //password was wrong!!!
                return "Invalid Credentials!!!";
            }
        } catch (NoSuchAlgorithmException e) {
            return "Internal Server issues while saving password, try again later!!!";
        }
    }

    public String updateUserById(Integer id, String phoneNumber) {
        User user= iUserRepo.findById(id).orElse(null);
        if(user !=null){
            user.setPhoneNumber(phoneNumber);
            iUserRepo.save(user);
            return"updated";
        }else{
            return "record not found";
        }
    }
}

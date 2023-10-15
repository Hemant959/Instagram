package com.Hemant.Insta.Service;

import com.Hemant.Insta.Repo.IPtokenRepo;
import com.Hemant.Insta.model.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PtokenService {
    @Autowired
    static IPtokenRepo iPtokenRepo;

    public static void CreateToken(AuthenticationToken token) {
        iPtokenRepo.save(token);
    }
}

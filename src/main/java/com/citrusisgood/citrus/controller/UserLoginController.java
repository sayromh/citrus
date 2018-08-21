package com.citrusisgood.citrus.controller;

import com.citrusisgood.citrus.model.UserLogin;
import com.citrusisgood.citrus.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginRepository userLoginRepository;

    @GetMapping("/user/{username}")
    public UserLogin getUserLogin(@PathVariable String username) {
        System.out.println("Get User Login");
        return userLoginRepository.findByUsername(username);
    }
}

package com.example.spring.security.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping(value = "/login")
    public ResponseEntity<String> login() {

        //return hello
        return new ResponseEntity<>("Hello Worls", HttpStatus.OK);
    }
}

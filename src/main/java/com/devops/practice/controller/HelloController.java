package com.devops.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @PostMapping
    public ResponseEntity<?> printHello(){
        return new ResponseEntity<>("Hello", HttpStatus.ACCEPTED);
    }
}

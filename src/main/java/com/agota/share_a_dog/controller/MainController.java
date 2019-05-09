package com.agota.share_a_dog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MainController {

    @GetMapping(value = "/")
    public ResponseEntity<String> mainPage() {
        return ResponseEntity.ok("This is share a dog app BE");
    }
}

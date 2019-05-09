package com.agota.share_a_dog.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DogController {

    @GetMapping(value = "/dog")
    public ResponseEntity<String> fetchDoggo() {
        return ResponseEntity.ok("Doggo number 1 \nBest dogggo #1");
    }
}

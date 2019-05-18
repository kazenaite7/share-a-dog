package com.agota.share_a_dog.controller;

import com.agota.share_a_dog.entity.Dog;
import com.agota.share_a_dog.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DogController {

    @Autowired
    private DogService service;

    @PostMapping(value = "/dog")
    public ResponseEntity createDog(@RequestBody Dog dog) {
        return ResponseEntity.ok(service.createDog(dog));
    }

    @GetMapping(value = "/dog/{dogId}")
    public ResponseEntity getDog(@PathVariable("dogId") String dogId) {
        Dog dog = service.findDog(dogId);
        if (dog != null) {
            return ResponseEntity.ok(dog);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}

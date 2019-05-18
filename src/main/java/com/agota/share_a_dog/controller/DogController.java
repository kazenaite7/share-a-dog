package com.agota.share_a_dog.controller;


import com.agota.share_a_dog.repo.DogRepository;
import com.agota.share_a_dog.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DogController {

    @Autowired
    private DogRepository repo;

    public Dog creatDog(){
        Dog dogy = new Dog(123, "lala");
        return repo.save(dogy);
    }


    @GetMapping(value = "/dog")
    public ResponseEntity fetchDoggo() {
        creatDog();
        List<Dog> dogiai = repo.findAll();
        Dog dog = dogiai.get(0);
        Integer count = dogiai.size();
        return ResponseEntity.ok("we have " + count + " doggos");
        //return ResponseEntity.ok("Doggo number 1 \nBest dogggo #1");
    }


}

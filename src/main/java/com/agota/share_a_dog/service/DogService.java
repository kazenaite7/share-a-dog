package com.agota.share_a_dog.service;

import com.agota.share_a_dog.entity.Dog;
import com.agota.share_a_dog.repo.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository repo;


    public Dog borrowDog(Dog dog) {
        dog.setBorrowed(true);
        repo.save(dog);
        return dog;
    }

    public Dog createDog(Dog dog){
        return repo.save(dog);
    }

    public Dog findDog(String dogId){
        List<Dog> dogs = repo.findAll();
        for (Dog dog : dogs) {
            if (dog.getDogId().equals(dogId)) {
                return dog;
            }
        }
        return null;
    }
}

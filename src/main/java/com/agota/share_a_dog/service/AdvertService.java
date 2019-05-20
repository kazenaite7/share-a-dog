package com.agota.share_a_dog.service;

import com.agota.share_a_dog.entity.Advert;
import com.agota.share_a_dog.entity.Dog;
import com.agota.share_a_dog.repo.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertService {

    @Autowired
    private AdvertRepository repo;

    @Autowired
    private DogService dogService;

    public Advert saveAdvert(Advert advert) {
        return repo.save(advert);
    }

    public Advert findAdvert(String name) {
        List<Advert> adverts = repo.findAll();
        for (Advert advert : adverts) {
            if (advert.getName().equals(name)) {
                return advert;
            }
        }
        return null;
    }

    public Advert borrow(String name) {
        Advert advert = findAdvert(name);
        if (advert != null) {
            Dog dog = dogService.findDog(advert.getDogId());
            if (dog != null) {
                dogService.borrowDog(dog, dog.getDogId());
                return advert;
            }
        }
        return null;
    }

}

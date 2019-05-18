package com.agota.share_a_dog.controller;

import com.agota.share_a_dog.entity.Advert;
import com.agota.share_a_dog.service.AdvertService;
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
public class AdvertController {

    @Autowired
    private AdvertService service;

    @PostMapping(value = "/advert")
    public ResponseEntity createAdvert(@RequestBody Advert advert) {
        return ResponseEntity.ok(service.saveAdvert(advert));
    }

    @GetMapping(value = "/advert/{name}")
    public ResponseEntity fetchAdvert(@PathVariable("name") String name) {
        Advert advert = service.findAdvert(name);
        if (advert != null) {
            return ResponseEntity.ok(advert);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @GetMapping(value = "/advert/borrow/{name}")
    public ResponseEntity borrowAdvert(@PathVariable("name") String name) {
        Advert advert = service.borrow(name);
        if (advert != null) {
            return ResponseEntity.ok(advert);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}

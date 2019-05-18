package com.agota.share_a_dog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "advert")
public class Advert {
    @Id
    private String id;

    private String name;

    private String dogId;

    private String borrowTime;

    private String city;

    public Advert() {

    }

    public Advert(String name, String dogId, String borrowTime, String city) {
        this.name = name;
        this.dogId = dogId;
        this.borrowTime = borrowTime;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDogId() {
        return dogId;
    }

    public void setDogId(String dogId) {
        this.dogId = dogId;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

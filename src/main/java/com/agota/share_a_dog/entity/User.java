package com.agota.share_a_dog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;

    private String name;

    private Double rate;

    private String userId;

    public User() {
    }

    public User(String name, Double rate, String userId) {
        this.name = name;
        this.rate = rate;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}

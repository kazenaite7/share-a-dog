package com.agota.share_a_dog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dog")
public class Dog {
    @Id
    private String id;

    private String dogId;

    private String name;

    private String image;

    private String bread;

    private Integer age;

    private String ownerId;

    private Boolean isBorrowed;

    private Double size;

    public Dog() {
        isBorrowed = false;
    }

    public Dog(String dogId, String name, String image, String bread, Integer age, String ownerId, Double size) {
        this.dogId = dogId;
        this.name = name;
        this.image = image;
        this.bread = bread;
        this.age = age;
        this.ownerId = ownerId;
        isBorrowed = false;
        this.size = size;
    }

    public String getDogId() {
        return dogId;
    }

    public void setDogId(String dogId) {
        this.dogId = dogId;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}

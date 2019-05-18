package com.agota.share_a_dog.entity;

public class Dog {
    private Integer id;
    private String name;

    public  Dog(){

    }

    public Dog(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.agota.share_a_dog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contract")
public class Contract {

    @Id
    private String id;

    private String ownerId;

    private String loverId;

    public Contract() {
    }

    public Contract(String ownerId, String loverId) {
        this.ownerId = ownerId;
        this.loverId = loverId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getLoverId() {
        return loverId;
    }

    public void setLoverId(String loverId) {
        this.loverId = loverId;
    }
}

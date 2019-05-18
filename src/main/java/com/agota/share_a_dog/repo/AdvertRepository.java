package com.agota.share_a_dog.repo;

import com.agota.share_a_dog.entity.Advert;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdvertRepository extends MongoRepository<Advert, String> {
}

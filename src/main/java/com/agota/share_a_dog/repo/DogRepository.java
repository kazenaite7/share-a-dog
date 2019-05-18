package com.agota.share_a_dog.repo;
import com.agota.share_a_dog.entity.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DogRepository extends MongoRepository<Dog, String> {
}

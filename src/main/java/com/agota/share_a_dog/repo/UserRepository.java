package com.agota.share_a_dog.repo;

import com.agota.share_a_dog.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

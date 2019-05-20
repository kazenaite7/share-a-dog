package com.agota.share_a_dog.repo;

import com.agota.share_a_dog.entity.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract, String> {
}

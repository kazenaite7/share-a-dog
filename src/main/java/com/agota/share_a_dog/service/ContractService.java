package com.agota.share_a_dog.service;

import com.agota.share_a_dog.entity.Contract;
import com.agota.share_a_dog.repo.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    @Autowired
    private ContractRepository repo;

    public Contract createContract(String ownerId, String lowerId){
        return repo.save(new Contract(ownerId,lowerId));
    }
}

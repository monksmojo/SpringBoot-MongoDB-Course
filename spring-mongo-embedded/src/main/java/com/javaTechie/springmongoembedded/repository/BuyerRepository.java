package com.javaTechie.springmongoembedded.repository;

import com.javaTechie.springmongoembedded.entity.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends MongoRepository<Buyer,Long> {
}

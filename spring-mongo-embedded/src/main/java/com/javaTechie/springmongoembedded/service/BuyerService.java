package com.javaTechie.springmongoembedded.service;

import com.javaTechie.springmongoembedded.entity.Buyer;
import com.javaTechie.springmongoembedded.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    @Autowired
    BuyerRepository buyerRepository;

    public Boolean placeOrder(Buyer buyer){
        buyerRepository.save(buyer);
        return true;
    }

    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }
}

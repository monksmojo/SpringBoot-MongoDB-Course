package com.javaTechie.springmongoembedded.controller;

import com.javaTechie.springmongoembedded.entity.Buyer;
import com.javaTechie.springmongoembedded.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order-app")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @PostMapping(path = "/place-order")
    public ResponseEntity<String> placeOrder(@RequestBody Buyer buyer){
        if(buyerService.placeOrder(buyer)){
            return new ResponseEntity<>("the order has been created", HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>("the order cannot be created", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/get-all-buyers/")
    public ResponseEntity<List<Buyer>> getAllBuyers(){
        List<Buyer> buyerList=buyerService.getAllBuyers();
        return new ResponseEntity<>(buyerList,HttpStatus.OK);
    }





}

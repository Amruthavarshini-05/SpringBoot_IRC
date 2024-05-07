package com.example.day4post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4post.model.BankApp;
import com.example.day4post.model.User;
import com.example.day4post.service.BankAppService;
import com.example.day4post.service.Service_1;

@RestController
public class BankAppController {
    @Autowired
    BankAppService bs;
    @Autowired
    Service_1 serv;

    @PostMapping("/busbook/user/{id}")
        public ResponseEntity<BankApp> postBus(@RequestBody BankApp bus ,@PathVariable("id") int id){
           User user =serv.getById(id);
           bus.setUser(user);

           return new ResponseEntity<>(bs.createB(bus),HttpStatus.CREATED);
        }
        
        @GetMapping("/busbook/user/{id}")
        public ResponseEntity<BankApp> postBusId(@PathVariable("id") int id){
        return new ResponseEntity<>(bs.getBusbyid(id),HttpStatus.CREATED);
        }
    

    
}

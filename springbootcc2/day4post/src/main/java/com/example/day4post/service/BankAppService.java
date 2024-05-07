package com.example.day4post.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4post.model.BankApp;
import com.example.day4post.repository.BankAppRepo;

@Service
public class BankAppService {
    @Autowired
    BankAppRepo br;

    public BankApp createB(BankApp bus){
        return br.save(bus);
    }

    public BankApp getBusbyid(int id){
        return br.findById(id).orElse(null);
    }
    
}

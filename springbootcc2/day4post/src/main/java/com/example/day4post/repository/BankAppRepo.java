package com.example.day4post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4post.model.BankApp;

public interface BankAppRepo extends JpaRepository<BankApp,Integer>{
    
}

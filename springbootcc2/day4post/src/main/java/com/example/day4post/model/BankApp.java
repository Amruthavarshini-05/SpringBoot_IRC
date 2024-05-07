package com.example.day4post.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bank")
public class BankApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String depositAmount;
    String withdrawalAmount;
    String creditedAmount;
    String debitedDate;
    String creditedDate;

    @OneToOne
    @JsonBackReference

    private User user;

    public BankApp() {
    }

    public BankApp(int id, String depositAmount, String withdrawalAmount, String creditedAmount, String debitedDate,
            String creditedDate, User user) {
        this.id = id;
        this.depositAmount = depositAmount;
        this.withdrawalAmount = withdrawalAmount;
        this.creditedAmount = creditedAmount;
        this.debitedDate = debitedDate;
        this.creditedDate = creditedDate;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getCreditedAmount() {
        return creditedAmount;
    }

    public void setCreditedAmount(String creditedAmount) {
        this.creditedAmount = creditedAmount;
    }

    public String getDebitedDate() {
        return debitedDate;
    }

    public void setDebitedDate(String debitedDate) {
        this.debitedDate = debitedDate;
    }

    public String getCreditedDate() {
        return creditedDate;
    }

    public void setCreditedDate(String creditedDate) {
        this.creditedDate = creditedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    

    




    
}

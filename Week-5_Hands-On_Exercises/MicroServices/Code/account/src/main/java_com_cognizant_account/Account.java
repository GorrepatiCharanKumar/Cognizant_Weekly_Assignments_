package com.cognizant.account;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Account {
    private String number;
    private String type;
    private double balance;


    // // Getters
    // public String getNumber() { return number; }
    // public String getType() { return type; }
    // public double getBalance() { return balance; } Handeled By Lambok 
    //But i have doubt becz iam not including setter here 
}

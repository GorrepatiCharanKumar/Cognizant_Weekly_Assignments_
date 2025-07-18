package com.cognizant.account.service;

import org.springframework.stereotype.Service;

import com.cognizant.account.Account;
@Service
public class AccountService {
    public Account getAccountDetails(String number){
        return new Account("3233","Savings",2000.00);
        
    }
}

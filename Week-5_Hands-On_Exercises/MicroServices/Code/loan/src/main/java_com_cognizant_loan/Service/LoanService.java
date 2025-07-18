package com.cognizant.loan.service;

import org.springframework.stereotype.Service;

import com.cognizant.loan.model.Loan;

@Service
public class LoanService {
    public Loan getLoanDetails(String number) {
        return new Loan(number, "car", 400000, 3258, 18);
    }
}

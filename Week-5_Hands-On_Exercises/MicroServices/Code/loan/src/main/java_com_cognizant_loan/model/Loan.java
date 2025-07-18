package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Loan {
    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;
}

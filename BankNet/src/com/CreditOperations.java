package com;

public class CreditOperations {

    // TODO: make private
    public BankNet banks;
    private String bankNames[] = {"PI", "OB", "RF", "AL", "HS"};

    public CreditOperations() {
        banks = new BankNet(bankNames.length, 300, i -> bankNames[i]);
    }

}

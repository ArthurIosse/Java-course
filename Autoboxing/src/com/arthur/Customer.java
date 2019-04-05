package com.arthur;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransactions(initialAmmount);
    }

    public void addTransactions(double ammount){
        transactions.add(ammount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

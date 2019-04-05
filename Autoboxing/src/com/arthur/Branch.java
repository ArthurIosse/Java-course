package com.arthur;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmmount){
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName,initialAmmount));
            return true;
        }
            return false;
    }

    public boolean addCustomerTransaction(String customerName, double ammount){
        Customer existingCostumer = findCustomer(customerName);
        if(existingCostumer != null){
            existingCostumer.addTransactions(ammount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0 ; i < customers.size() ; i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}

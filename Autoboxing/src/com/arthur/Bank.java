package com.arthur;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, String branchName, double initialAmmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addNewCustomer(customerName,initialAmmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName, double ammount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            return existingBranch.addCustomerTransaction(customerName, ammount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i = 0 ; i < branches.size() ; i++){
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean getBranchCustomers(String branchName,boolean showTransactions){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            System.out.println("Customer List for "+ existingBranch.getName() +" branch:" );
            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();

            for(int i = 0 ; i < branchCustomers.size() ; i ++){
                Customer branchCustumer = branchCustomers.get(i);
                System.out.println("#"+i+" Customer: "+ branchCustumer.getName());

                if(showTransactions){
                    ArrayList<Double> transactions = branchCustumer.getTransactions();
                    System.out.println("transactions : ");
                  for(int j = 0 ; j < transactions.size()  ; j ++){
                      System.out.println(transactions.get(j));
                  }
                }
            }
            return true;
        }else {
            return false;
        }
    }



}

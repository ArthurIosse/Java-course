package com.arthur;

public class Main {

    public static void main(String[] args) {

        Bank hapoalim = new Bank("Hapoalim");
        hapoalim.addBranch("rishon");
        hapoalim.addBranch("holon");

        hapoalim.addCustomer("Arthur","rishon",140.0);
        hapoalim.addCustomer("Sasha","rishon",90.0);

        hapoalim.addCustomerTransaction("rishon","Arthur",13.0);
        hapoalim.addCustomerTransaction("rishon", "Arthur", 25.0);

        hapoalim.getBranchCustomers("rishon",false);
        hapoalim.getBranchCustomers("holon",false);
    }
}

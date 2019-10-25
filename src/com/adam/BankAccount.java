package com.adam;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    //getters and setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public void setPhoneNumber(int num) {
        this.phoneNumber = num;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }



    //deposit and withdraw methods

    public void deposit(double dep) {
        this.balance+=dep;
        System.out.println(dep + " deposited, total balance: " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Error: overdraft detected");
        } else {
            this.balance -= withdrawAmount;
            System.out.println(withdrawAmount + " withdrawn, account balance: " + this.balance);
        }
    }




}

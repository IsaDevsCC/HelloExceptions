package com.ironhack.TestExcepctions;

public class Account {

    private String name;
    private String address;
    private double balance;
    private int accountNumber;

    public Account() {
    }

    public Account(String name, String address, double balance, int accountNumber) {
        setName(name);
        setAddress(address);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

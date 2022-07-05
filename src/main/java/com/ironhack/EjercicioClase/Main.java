package com.ironhack.EjercicioClase;

import net.datafaker.Faker;

/*
* As a group, write your tests first, then write the minimum amount of code needed to pass them, then refactor for efficiency. Your tests should cover positive and negative cases including Exceptions.
Begin by Creating 2 classes Account and PaymentProcessor. The Account class should have name, address, balance, and accountNumber properties with getters and setters.
The PaymentProcessor class should have a processTaxExemptPurchase method that takes in 2 Accounts (a buyer and seller) and a purchaseAmount. The purchaseAmount should be deducted from the buyer Account balance and added to the seller Account balance.
The PaymentProcessor class should also have a processTaxedPurchase method. This should have the same parameters as the processTaxExemptPurchase method but should add a 14% tax to the purchaseAmount then deduct that sum from buyer balance and add it to seller balance.
The PaymentProcessor class should have an issueRefund method that takes in a buyer, seller, purchaseAmount, and integer percent. The specified percent of the purchaseAmount should be transferred from the seller to the buyer.*/
public class Main {
    public static void main(String f[]) throws Exception {

        var fake = new Faker();
        Account buyer = new Account(fake.name().fullName(), fake.address().cityName(), 892, fake.number().numberBetween(15, 899));
        Account seller = new Account(fake.name().fullName(), fake.address().cityName(), 0, fake.number().numberBetween(15, 1200));


        PaymentProcessor.processTaxExemptPurchase(buyer, seller, 200);
        PaymentProcessor.processTaxedPurchase(buyer, seller, 200);
        PaymentProcessor.issueRefund(buyer, seller, 200, 25);
    }
}

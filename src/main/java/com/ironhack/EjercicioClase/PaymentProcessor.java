package com.ironhack.EjercicioClase;

public class PaymentProcessor {

    public PaymentProcessor() {
    }

    public static float processTaxExemptPurchase(Account buyer, Account seller, float purchaseAmount) throws Exception {

        if(buyer.getBalance() < purchaseAmount) {
            throw new Exception ("The balance cant cover the purchase");
        } else {
            buyer.setBalance(buyer.getBalance() - purchaseAmount);
            seller.setBalance((seller.getBalance() + purchaseAmount));
        }
        return seller.getBalance();
    }

    public static void processTaxedPurchase(Account buyer, Account seller, float purchaseAmount) throws Exception {

        final double PERCENTAGE = 0.14;
        if(buyer.getBalance() < purchaseAmount) {
            throw new Exception ("The balance cant cover the purchase");
        } else {
            buyer.setBalance((float) (buyer.getBalance() - (purchaseAmount + (purchaseAmount * 0.14))));
            seller.setBalance((float) (seller.getBalance() + (purchaseAmount + (purchaseAmount * 0.14))));
        }
        System.out.println(seller.getBalance());
    }
    public static void issueRefund(Account buyer, Account seller, float purchaseAmount, int percentage) throws Exception {
        final double PERCENTAGE = percentage / 100.00;

        if(buyer.getBalance() < purchaseAmount) {
            throw new Exception ("The balance cant cover the purchase");
        } else {
            buyer.setBalance((float) (buyer.getBalance() - (purchaseAmount + (purchaseAmount * PERCENTAGE))));
            seller.setBalance((float) (seller.getBalance() + (purchaseAmount + (purchaseAmount * PERCENTAGE))));
        }
        System.out.println(seller.getBalance());
    }
}



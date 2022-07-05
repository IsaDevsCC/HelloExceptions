package com.ironhack.EjercicioClase;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    @Test
    void processTaxExemptPurchase_Float() throws Exception {
        var fake = new Faker();
        Account buyer = new Account(fake.name().fullName(), fake.address().cityName(), 892, fake.number().numberBetween(15, 899));
        Account seller = new Account(fake.name().fullName(), fake.address().cityName(), 0, fake.number().numberBetween(15, 1200));

        var result = PaymentProcessor.processTaxExemptPurchase(buyer, seller, 200);

        assertEquals(200, result);
    }
}
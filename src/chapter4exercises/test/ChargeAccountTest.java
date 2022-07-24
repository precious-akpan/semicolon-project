package chapter4exercises.test;

import chapter4exercises.ChargeAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChargeAccountTest {
    ChargeAccount customer = new ChargeAccount(/*1001, 10_000, 5, 5000, 10_000*/);

    @BeforeEach
    void setUp() {
        customer.setBalance(5000);
    }

    @Test
    void getAccountNumberTest() {
        customer.setAccountNumber(1001);
        assertEquals(1001, customer.getAccountNumber());
    }

    @Test
    void setAccountNumberTest() {
//        ChargeAccount customer = new ChargeAccount();
        customer.setAccountNumber(1001);
        assertEquals(1001, customer.getAccountNumber());
    }

    @Test
    void setBalanceTest() {
        customer.setBalance(5000);
        assertEquals(customer.getBalance(), 5000);
    }

    @Test
    void getBalance() {
        assertEquals(5000, customer.getBalance());
    }

    @Test
    void setItemsTest() {
        customer.setCharges(5);
        assertEquals(5, customer.getCharges());
    }


    @Test
    void getItemsTest() {
        customer.setCharges(5);
        int item = customer.getCharges();
        assertEquals(5, item);
    }


    @Test
    void getCreditTest() {
        customer.setCredit(1000);
        assertEquals(1000, customer.getCredit());
    }

    @Test
    void setCredit() {
        customer.setCredit(1000);
        assertEquals(1000, customer.getCredit());
    }

    @Test
    void getCreditLimitTest() {
        customer.setCreditLimit(1000);
        assertEquals(1000, customer.getCreditLimit());
    }

    @Test
    void setCreditLimit() {
        customer.setCreditLimit(1000);
        assertEquals(1000, customer.getCreditLimit());
    }

    @Test
    void calculateBalanceTest() {

        customer.calculateBalance();
    }
}
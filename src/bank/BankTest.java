package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test public void bankCanCreateAccountTest() {
        Bank aceBank = new Bank("Ace Bank Plc");
        aceBank.register("Ace", "7687");
        aceBank.register("Nepa", "1212");
        aceBank.register("Abigail", "1111");
        assertEquals(2, aceBank.getNumberOfCustomers());
    }

    @Test public void newAccountHaveAccountNumberTest() {
        Bank aceBank = new Bank("Ace Bank Plc");
        aceBank.register("ace", "1234");
//        Account savedAccount = aceBank.getAccountByAccountNumber(1);
//        assertEquals("Ace", savedAccount.getAccountName());
//        assertEquals(1, savedAccount.getAccountNumber());

    }

//    @Test public
}

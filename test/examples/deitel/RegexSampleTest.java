package examples.deitel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegexSampleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testForIsValidPhoneNumber() {
        String phoneNumber = "+234-8022334455";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithCharactersGreaterThan_15_digitsAreInvalid() {
        String phoneNumber = "+234-802233445566";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithCharactersLessThan_15_digitsAreInvalid() {
        String phoneNumber = "+234-802233445";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testThatPhoneNumbersWithOtherCountryCodesAreInvalid() {
        String phoneNumber = "+233-8022334455";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    //TODO: Add test for phone number with with 0 after dash
    @Test
    void testPhoneNumberWith_0_AfterDashIsValid() {
        String phoneNumber = "+234-08022334455";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithoutPrefixIsValid() {
        String phoneNumber = "08002233445";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithoutPrefix_0_IsInvalid() {
        String phoneNumber = "8002233445";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }
}
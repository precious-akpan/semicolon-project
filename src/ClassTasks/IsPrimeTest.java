package ClassTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsPrimeTest {
    @Test
    public void isPrime() {
        boolean isPrime = IsPrime.isPrime(2);
//        System.out.println(isPrime);
        assertTrue(isPrime);
    }
}

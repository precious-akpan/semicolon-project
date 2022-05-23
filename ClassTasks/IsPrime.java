package ClassTasks;

import static ClassTasks.Factors.noOfFactor;

public class IsPrime {
    public static boolean isPrime(int number) {
        System.out.println(noOfFactor(number)==2?"true":"false");
        return noOfFactor(number) == 2;
    }
}

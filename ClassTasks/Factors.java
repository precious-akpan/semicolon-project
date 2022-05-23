package ClassTasks;


public class Factors {
//    private int factors;

    public static int noOfFactor(int number) {
        int factors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors++;
            }
        }
        return factors;
    }
}

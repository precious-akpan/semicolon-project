 package examples.deitel;

public class InitArrayCommandLineArgs {
    public static void main(String[] args) throws Exception {
        if(args.length != 3) {
            throw new Exception("Error: please reenter the entire command, including%n\" +\n" +
                                "                              \"an array size, initial value and increment.%n\"");
//            System.out.printf("Error: please reenter the entire command, including%n" +
//                              "an array size, initial value and increment.%n");
        } else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < array.length; counter++) {
                array[counter] += initialValue + increment * counter;
            }

            System.out.printf("%s%8s%n", "Index", "Value");

            for (int count = 0; count < array.length; count++) {
                System.out.printf("%5d%8d%n", count, array[count]);
            }
        }
    }
}

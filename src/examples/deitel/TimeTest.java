package examples.deitel;

public class TimeTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 26, 17);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(99, 99, 99);

        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);

    }


    public static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}

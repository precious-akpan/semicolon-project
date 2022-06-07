package ClassTasks;

public class Main {
    public static void main(String[] args) {
        Native omotola = new Native();

        omotola.eat();
        omotola.sleep();
        System.out.println(omotola.learnJava());

        Facilitator grace = new Facilitator();

        String result = grace.teachJava();
        System.out.println(result);
    }
}

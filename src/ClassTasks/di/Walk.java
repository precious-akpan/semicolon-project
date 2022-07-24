package ClassTasks.di;

public interface Walk {
    void walk();

    public default void run() {
        System.out.println("I am running");
    }
}

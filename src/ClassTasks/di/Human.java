package ClassTasks.di;

public class Human {
    private Walk walkInPidgin = new DorcasWalk();
    public Human() {

    }


    public Human(Walk walkInPidgin) {
        this.walkInPidgin = walkInPidgin;
    }

    public void setWalkInPidgin(Walk walkInPidgin) {
        this.walkInPidgin = walkInPidgin;
    }

    public void walk() {
        walkInPidgin.walk();
    }
}

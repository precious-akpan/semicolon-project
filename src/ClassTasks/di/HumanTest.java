package ClassTasks.di;

import org.junit.jupiter.api.Test;

class HumanTest {
    @Test
    public void diTest() {
        DorcasWalk dorcasWalk = new DorcasWalk();
        Walk catWalk = new CatWalk();
        Human jummie = new Human();
        jummie.walk();
//        jummie.setWalkInPidgin(dorcasWalk);
    }



}
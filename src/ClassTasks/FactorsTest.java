package ClassTasks;

import static org.testng.AssertJUnit.assertEquals;


class FactorsTest {

    @org.junit.jupiter.api.Test
    public void noOfFactor() {
        int factors = Factors.noOfFactor(8);

        assertEquals(4, factors);
    }
}
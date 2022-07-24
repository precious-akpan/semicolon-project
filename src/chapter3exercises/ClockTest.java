package chapter3exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockTest {


    @Test
    void getHour() {
        Clock time = new Clock(23, 59, 159);
        assertEquals(23, time.getHour());
    }

    @Test
    void setHour() {
        Clock time = new Clock(20, 20, 20);
        time.setHour(23);
        assertEquals(23, time.getHour());
    }

    @Test
    @DisplayName("Set method should not set a value above 59")
     void setHourAboveTwentyThree() {
        Clock time = new Clock(20, 20, 20);
        time.setHour(100);
        assertEquals(20, time.getHour());
    }

    @Test
    @DisplayName("Set method should not set a value below 0")
     void setHourBelowZero() {
        Clock time = new Clock(20, 20, 20);
        time.setHour(-1);
        assertEquals(20, time.getHour());
    }

    @Test
    void getMinute() {
        Clock time = new Clock(20, 20, 30);
        assertEquals(20, time.getMinute());
    }

    @Test
    void setMinute() {
        Clock time = new Clock(20, 20, 20);
        time.setMinute(35);
        assertEquals(35, time.getMinute());
    }

    @Test
    @DisplayName("Set method should not set a value above 59")
    void setMinuteAboveFiftyNine() {
        Clock time = new Clock(20, 20, 20);
        time.setMinute(100);
        assertEquals(20, time.getHour());
    }

    @Test
    @DisplayName("Set method should not set a value below 0")
    void setMinuteBelowZero() {
        Clock time = new Clock(20, 20, 20);
        time.setMinute(-1);
        assertEquals(20, time.getMinute());
    }

    @Test
    void getSecond() {
        Clock time = new Clock(59, 59, 59);
        assertEquals(59, time.getSecond());
    }

    @Test
    void setSecond() {
        Clock time = new Clock(45, 45, 45);
        time.setSecond(50);
        assertEquals(50, time.getSecond());
    }

    @Test
    @DisplayName("Set method should not set a value above 59")
    void setSecondAboveFiftyNine() {
        Clock time = new Clock(20, 20, 20);
        time.setSecond(100);
        assertEquals(20, time.getSecond());
    }

    @Test
    @DisplayName("Set method should not set a value below 0")
    void setSecondBelowZero() {
        Clock time = new Clock(20, 20, 20);
        time.setSecond(-1);
        assertEquals(20, time.getSecond());
    }

}
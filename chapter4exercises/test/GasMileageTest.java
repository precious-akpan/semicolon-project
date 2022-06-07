package chapter4exercises.test;

import chapter4exercises.GasMileage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    @Test
    void TestForMileage() {
        GasMileage trip = new GasMileage();
        trip.setMiles(50);
        assertEquals(50, trip.getMiles());
    }

    @Test
    void testForGallons() {
        GasMileage trip = new GasMileage();
        trip.setGallons(20);
        assertEquals(20, trip.getGallons());
    }

    @Test
    void testForMilesPerGallon() {
        GasMileage trip = new GasMileage();
        trip.setGallons(20);
        trip.setMiles(60);
        assertEquals(3, trip.calculateMPG(trip.getMiles(), trip.getGallons()));
    }

}
package africa.semicolon.BikeTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    private Object Okada;

    @Test
    public void testThatSpeedCanBeSet(){
        Bike okada = new Bike();
        okada.getSpeedInKmPerHour();
        okada.setSpeedInKmPerHour(1);
        assertEquals(15,okada.getSpeedInKmPerHour());
    }
    @Test
    public void testThatBikeCanChangeToGearTwoWhenItHits20kmph(){
        Bike okada = new Bike();
        okada.setOn(true);
        okada.setSpeedInKmPerHour(15);
        assertEquals(15, okada.getSpeedInKmPerHour());
        okada.speedUp();
        assertEquals(16,okada.getSpeedInKmPerHour());
        okada.setSpeedInKmPerHour(20);
        okada.speedUp();
        assertEquals(22,okada.getSpeedInKmPerHour());

    }

}

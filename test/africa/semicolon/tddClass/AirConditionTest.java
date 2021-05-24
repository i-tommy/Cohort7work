package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {

    @Test
    public void TestThatAirConditionCanComeOn() {
        AirConditioner samsung = new AirConditioner();
        samsung.setOn(true);
        assertTrue(samsung.isEngineOn());
    }
        @Test
       public void TestThatAirConditionerTemperatureCanBeSet(){
       AirConditioner samsung = new AirConditioner();
       samsung.setOn(true);
       samsung.setTemperature(16);
       assertEquals(16, samsung.getTemperature());

        }

        @Test
    public void testThatTemperatureCannotBeSetWhenAirConditionerIsOff(){
        AirConditioner samsung = new AirConditioner();
        samsung.setOn(false);
        samsung.setTemperature(20);
        assertEquals(0, samsung.getTemperature());
        }

        @Test
    public void testThatTemperatureCanBeIncrease(){
        AirConditioner samsung = new AirConditioner();
        samsung.setOn(true);
        samsung.setTemperature(25);
        assertEquals(25, samsung.getTemperature());
        samsung.increaseTemperature();
        assertEquals(26, samsung.getTemperature());
        }

        @Test
    public void testThatTemperatureCanBeDecrease(){
        AirConditioner samsung = new AirConditioner();
        samsung.setOn(true);
        samsung.setTemperature(25);
        assertEquals(25, samsung.getTemperature());
        samsung.decreaseTemperature();
        assertEquals(24, samsung.getTemperature());
    }

}


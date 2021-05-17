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
       samsung.setTemperature(16);
       assertEquals(16, samsung.getTemperature());

        }

        @Test
    public void testThatTemperatureCannotBeSetWhenAirconditionerIsOff(){
        AirConditioner samsung = new AirConditioner();
        samsung.setTemperature(20);
        assertEquals(20, samsung.getTemperature());
        }

}


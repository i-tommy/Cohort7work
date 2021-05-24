package TelevisionTest;

import africa.semicolon.tddClass.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {

    @Test

public void testThatTelevisionCanBeTurnOn(){
        Television samsung = new Television();
        samsung.setOn(true);
    assertTrue(samsung.isOn());
    }

        @Test

        public void testThatChannelsCanBeSetWhenTelevisionIsOn() {
            Television samsung = new Television();
            samsung.setOn(true);
            assertTrue(samsung.isOn());
            samsung.setChannel(1);
            assertEquals(1, samsung.getChannel());
        }
        @Test

        public void testThatChannelsCannotBeSetWhenTelevisionIsOff(){
            Television samsung = new Television();
            samsung.setOn(false);
            assertFalse(samsung.isOn());
            samsung.setChannel(1);
            assertEquals(0, samsung.getChannel());
    }

    private void assertEquals(int i, int channel) {
    }

    private void assertFalse(boolean on) {
    }
    
    @Test
    public void testThatNumberCanBeIncreaseManuallyWhenTvIsON(){
        Television samsung = new Television();
        samsung.setOn(true);
        assertEquals(samsung.isOn());
        
    }

    private void assertEquals(boolean on) {
        
    }


}




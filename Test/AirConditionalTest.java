import TDD.AirConditional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    @Test
    public void testToActivateAirConditional(){
        AirConditional myAirconditional =  new AirConditional();
        assertFalse(myAirconditional.isOn());

        myAirconditional.setOn();

        assertTrue(myAirconditional.isOn());
    }
    @Test
    public void testToTellWhenInactive(){
        AirConditional myAirconditional =  new AirConditional();
        myAirconditional.setOn();
        assertTrue(myAirconditional.isOn());

        myAirconditional.setOff();
        assertFalse(myAirconditional.isOn());
    }
    @Test
    public void testTheIncreaseInTemperature(){
        AirConditional myAirconditional =  new AirConditional();
        myAirconditional.setOn();
        assertTrue(myAirconditional.isOn());
        int increase = myAirconditional.getIncreaseInTemperature(1);
        assertEquals(1, increase);
    }
    @Test
    public void testTheDecreaseInTemperature(){
        AirConditional myAirconditional =  new AirConditional();
        myAirconditional.setOn();
        assertTrue(myAirconditional.isOn());
        int decrease = myAirconditional.getDecreaseInTemperature(1);
        assertEquals(0,decrease);
    }
    @Test
    public void testWhenTemperatureIsBeyond30(){
        AirConditional myAirconditional =  new AirConditional();
        myAirconditional.setOn();
        assertTrue(myAirconditional.isOn());
        int beyond = myAirconditional.getIncreaseBeyond30(30);
        assertEquals(30,beyond);

    }
    @Test
    public void testWhenTemperatureIsBelow16(){
        AirConditional myAirconditional =  new AirConditional();
        myAirconditional.setOn();
        assertTrue(myAirconditional.isOn());
        int below = myAirconditional.getDecreaseBelow16(16);
        assertEquals(16, below);

    }
    

}

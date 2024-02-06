import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    private Bike myBike;

    @BeforeEach
    public void setUp(){
        myBike =new Bike();
    }

    @Test
    void TestForBikeOn(){
        assertFalse(myBike.isActive());
        myBike.powerOn();
        assertTrue(myBike.isActive());
    }
    @Test
    void testForBikeOff(){
        assertFalse(myBike.isActive());
        myBike.powerOn();
        assertTrue(myBike.isActive());
        myBike.powerOff();
        assertFalse(myBike.isActive());

    }
    @Test
    void testThatBikeCanAccelerate(){
        myBike.powerOn();
        for(int movement =1;movement <=10 ;movement++ ) {
            myBike.accelerate();
        }
        assertEquals(10, myBike.getBikeSpeed());
    }

    @Test
    void testThatBikeCanDecelerate() {
        myBike.powerOn();
        for(int movement =1;movement <=10 ;movement++ ) {
            myBike.accelerate();
        }
        for (int movement = 10; movement <= 1; movement--) {
            myBike.Decelerate();

        }
        assertEquals(10, myBike.getBikeDeceleration());
    }
//    @Test




}
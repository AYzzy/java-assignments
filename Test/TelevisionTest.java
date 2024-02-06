import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Television television = new Television();

    @BeforeEach
    public void setUp(){
        television = new Television();
    }

    @Test
    void testThatTelevisionIsActive() {
        assertFalse(television.isActive());
        television.setActive();
        assertTrue(television.isActive());
    }
    @Test
    void testThatTelevisionIsInactive(){
        assertFalse(television.isActive());
        television.setActive();
        assertTrue(television.isActive());
        television.setInactive();
        assertFalse(television.isActive());
    }
    @Test
    void testThatVolumeIncreases(){
        television.setActive();
        for(int movement =1;movement <=5 ;movement++ ) {
            television.setIncreaseInVolume();
        }
        assertEquals(5,television.getVolumeIncrease());
    }
    @Test
    void testThatVolumeDecreases(){
        television.setActive();
        for(int movement =1;movement <=5 ;movement++ ) {
            television.setIncreaseInVolume();
        }
        for(int movement =1;movement <=5 ;movement++ ) {
            television.setIncreaseInVolume();
        }
    assertEquals();
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void testToCheckLogistics(){
        Logic mylogic = new Logic();
        mylogic.logistics(70);
        assertEquals(40000,mylogic.logistics(70));
    }
    @Test
    void testForInvalidNumber(){
        Logic mylogic = new Logic();
        assertThrows(IllegalArgumentException.class,()->mylogic.logistics(-5));
    }

}
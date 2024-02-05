package PhoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    private PhoneBook myContact;
    @BeforeEach
    public void testThisFirst() {
      PhoneBook  myContact = new PhoneBook("ayo","mide","09115378330");
    }
    @Test
    public void TestForFirstName(){
        assertEquals("ayo",myContact.getFirstName());
    }

    @Test
    public void TestForLastName(){
        assertEquals("mide",myContact.getLastName());
    }
    @Test
    public void TestForPhoneNumber(){
        assertEquals("09115378330",myContact.getPhoneNumber());
    }

}



package RIS;

import junit.framework.TestCase;

public class ApartmentTest extends TestCase {

    public void testCreateEmptyApartment(){

        Apartment apartment = new Apartment();

        assertEquals(0,apartment.getSize());
        assertEquals(0, apartment.getRoomCount);
    }
}

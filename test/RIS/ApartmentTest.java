package RIS;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ApartmentTest extends TestCase {

    public void testCreateEmptyApartment(){

        Apartment apartment = new Apartment(new ArrayList<>());

        assertEquals(0,apartment.getSize());
        assertEquals(0, apartment.getRoomCount());
    }

    public void testCreateApartment(){

        Apartment apartment = new Apartment(new ArrayList<Room>(){
                {
                 add(new Room(Room.Type.Kitchen,12));
                 add(new Room(Room.Type.Bathroom, 7));
                 add(new Room(Room.Type.Room,15));
                 add(new Room(Room.Type.Room,25));
                }
        });

        assertEquals(59, apartment.getSize());
        assertEquals(4, apartment.getRoomCount());

    }
}

package RIS;

import junit.framework.TestCase;

public class RoomTest extends TestCase {

    public void testCreateRoom(){

        Room room = new Room(Room.type.Kitchen, 14);

        assertEquals(14, room.getSqr());
        assertEquals(Room.type.Kitchen, room.getType());
    }


}

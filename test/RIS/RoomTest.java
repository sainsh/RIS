package RIS;

import junit.framework.TestCase;

public class RoomTest extends TestCase {

    public void testCreateRoomWithFakeIt(){

        Room room = new Room(Room.Type.Kitchen, 14);

        assertEquals(14, room.getSqr());
        assertEquals(Room.Type.Kitchen, room.getType());
    }

    public void testCreateRoomBathroom(){

        Room room = new Room(Room.Type.Bathroom,9);

        assertEquals(9, room.getSqr());
        assertEquals(Room.Type.Bathroom, room.getType());
    }
    public void testCreateRoomRoom(){

        Room room = new Room(Room.Type.Room,20);

        assertEquals(20,room.getSqr());
        assertEquals(Room.Type.Room, room.getType());

    }


}

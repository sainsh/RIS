package RIS;

import java.util.ArrayList;

public class Apartment {


    private final ArrayList<Room> rooms;
    private int roomcount;
    private int size;

    public Apartment(ArrayList<Room> rooms) {
        this.rooms = rooms;
        size = 0;
        roomcount=0;
        for (Room room : rooms){
            size += room.getSqr();
            roomcount++;
        }

    }

    public int getSize() {
        return size;
    }

    public int getRoomCount() {
        return roomcount;
    }
}

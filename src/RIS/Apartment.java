package RIS;

import java.util.ArrayList;

public class Apartment {


    private ArrayList<Room> rooms;
    private int monthlyRent;
    private int roomCount;
    private int size;

    public Apartment(ArrayList<Room> rooms) {
        this.rooms = rooms;
        size = 0;
        roomCount = 0;
        for (Room room : rooms) {
            size += room.getSqr();
            roomCount++;
        }

    }

    public Apartment(int size, int monthlyRent) {
        this.size = size;
        this.monthlyRent = monthlyRent;
    }

    public int getSize() {
        return size;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }
}

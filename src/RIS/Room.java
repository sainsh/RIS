package RIS;



public class Room {


    public Room(type type, int sqr) {

    }

    public int getSqr() {
        return 14;
    }

    public type getType() {

        return type.Kitchen;
    }

    public enum type {
        Kitchen, Bathroom, Room
    }


}


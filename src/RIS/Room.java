package RIS;



public class Room {


    private final int sqr;
    private final Type type;

    public Room(Type type, int sqr) {
        this.sqr = sqr;
        this.type = type;
    }

    public int getSqr() {
        return sqr;
    }

    public Type getType() {

        return type;
    }

    public enum Type {
        Kitchen, Bathroom, Room
    }


}


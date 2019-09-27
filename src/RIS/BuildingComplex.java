package RIS;

import java.util.ArrayList;

public class BuildingComplex {
    private final String address;
    private int size;
    private ArrayList<Apartment> apartments;


    public BuildingComplex(String address, ArrayList<Apartment> apartments) {
        this.address = address;
        this.apartments = apartments;
        size = 0;
        for (Apartment apartment : apartments){
            size += apartment.getSize();
        }

    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }
}

package RIS;

import junit.framework.TestCase;

import java.util.ArrayList;

public class BuildingComplexTest extends TestCase {

    public void testCreateEmptyBuildingComplex(){

        BuildingComplex buildingComplex = new BuildingComplex("Store Gade 19, 7400 Herning", new ArrayList<Apartment>());

        assertEquals("Store Gade 19, 7400 Herning", buildingComplex.getAddress());
        assertEquals(0, buildingComplex.getSize());

    }

    public void testCreateBuildingComplex(){

        BuildingComplex complex = new BuildingComplex("Lille Gade 14, 7430 Ikast",  new ArrayList<Apartment>(){
            {
                add(new Apartment(40,0));
                add(new Apartment(40,0));
            }
        });

        assertEquals(80, complex.getSize());
        assertEquals("Lille Gade 14, 7430 Ikast", complex.getAddress());
    }
}

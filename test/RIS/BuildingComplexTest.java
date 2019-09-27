package RIS;

import junit.framework.TestCase;

public class BuildingComplexTest extends TestCase {

    public void testCreateEmptyBuildingComplex(){

        BuildingComplex buildingComplex = new BuildingComplex("Store Gade 19, 7400 Herning");

        assertEquals("Store Gade 19, 7400 Herning", buildingComplex.getAddress());
        assertEquals(0, buildingComplex.getSize());

    }
}

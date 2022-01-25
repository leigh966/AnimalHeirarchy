package com.tsi.leigh.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPigeon
{
    @Test
    public void testPigeon()
    {
        Pigeon p = new Pigeon();
        Assertions.assertEquals(2,p.getNumberOfLegs(),"Pigeon should start with 2 legs");
        Assertions.assertEquals(5,p.getEnergy(),"Pigeon should start with 5 energy");
        Assertions.assertEquals(2, p.getNumberOfWings(), "All birds should start with 2 wings");
    }

    @Test
    public void testWalk()
    {
        Pigeon p = new Pigeon();
        Assertions.assertEquals("Struts like a pigeon", p.walk(), "Pigeon should strut like a pigeon");
        Assertions.assertEquals(4, p.getEnergy(), "Pigeon should use 1 energy from starting 5 leaving 4");
    }
}

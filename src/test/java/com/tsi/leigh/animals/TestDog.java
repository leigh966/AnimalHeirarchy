package com.tsi.leigh.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDog
{
    @Test
    public void testDog()
    {
        Dog d = new Dog();
        Assertions.assertEquals(12, d.getEnergy(), "Dog should start with energy of 12");
        Assertions.assertEquals(4, d.getNumberOfLegs(), "Dog should start with 4 legs");
    }

    @Test
    public void testWalk()
    {
        Dog d = new Dog();
        d.walk();
        Assertions.assertEquals(10, d.getEnergy());
    }
}

package com.tsi.leigh.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.tsi.leigh.animals.Cat;

public class TestCat
{
    @Test
    public void testCat()
    {
        Cat c = new Cat();
        Assertions.assertEquals(4, c.getNumberOfLegs(), "Cat should be created with 4 legs");
        Assertions.assertEquals(20, c.getEnergy(), "Cat should start with 20 energy");
    }

    @Test
    public void testWarmBlooded()
    {
        Cat c = new Cat();
        Assertions.assertTrue(c.isWarmBlooded(), "Cat should be warm blooded");
    }

    @Test
    public void testWalk()
    {
        Cat c = new Cat();
        c.Walk();
        Assertions.assertEquals(19,c.getEnergy(),"Walking should bring cat energy from 20 to 19");
    }

    @Test
    public void testGetName()
    {
        Cat c = new Cat();
        Assertions.assertEquals("Cat", c.getName(), "Name should be Cat");
    }
}

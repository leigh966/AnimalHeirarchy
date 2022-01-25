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
        c.walk();
        Assertions.assertEquals(19,c.getEnergy(),"Walking should bring cat energy from 20 to 19");
    }

    @Test
    public void testGetName()
    {
        Cat c = new Cat();
        Assertions.assertEquals("Cat", c.getName(), "Name should be Cat");
    }

    @Test
    public void testReproduce()
    {
        Cat c = new Cat();
        Assertions.assertEquals("Births live young", c.reproduce(), "Cat should use the mammal method to birth live young");
    }

    public void accidentUnit(int numberOfLegsLost)
    {
        Cat c = new Cat();
        if(numberOfLegsLost <= 4 && numberOfLegsLost >= 0)
        {
            Assertions.assertEquals("Cat has lost "+numberOfLegsLost + " legs, " + (4 - numberOfLegsLost) + " legs left", c.haveAccident(numberOfLegsLost), "Message is wrong");
            Assertions.assertEquals(4 - numberOfLegsLost, c.getNumberOfLegs(), "Number of legs is wrong");
        }
        else
        {
            Assertions.assertEquals("That's not possible", c.haveAccident(numberOfLegsLost), "Method should reject number of legs lost");
            Assertions.assertEquals(4, c.getNumberOfLegs(), "Cat should not have lost any legs");
        }

        Assertions.assertTrue(c.getNumberOfLegs() >= 0 && c.getNumberOfLegs() <= 4, "Should have 0 <= numberOfLegs <= 4");
    }

    @Test
    public void testHaveAccident()
    {
        accidentUnit(4);
        accidentUnit(0);
        accidentUnit(-2);
    }
}

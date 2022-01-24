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

    }

    @Test
    public void testWarmBlooded()
    {
        Cat c = new Cat();
        Assertions.assertTrue(c.isWarmBlooded(), "Cat should be warm blooded");
    }
}

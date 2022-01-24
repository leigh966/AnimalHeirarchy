package com.tsi.leigh.animals.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.tsi.leigh.animals.Animal;
import com.tsi.leigh.animals.Cat;

public class CatTest
{
    @Test
    public void ConstructorTest()
    {
        Cat c = new Cat();
        Assertions.assertEquals(4, c.getNumberOfLegs());
    }
}

package com.tsi.leigh.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain
{
    @Test
    public void testMain()
    {
        Assertions.assertEquals(0, Main.main(null));
    }
}

package com.tsi.leigh.animals;

public class Pigeon extends Bird
{
    public Pigeon()
    {
        energy = 5;
    }

    public String walk()
    {
        energy -= 1;
        return "Struts like a pigeon";
    }


}

package com.tsi.leigh.animals;

public class Pigeon extends Bird implements LeggedAnimal
{

    private int numberOfLegs;
    public Pigeon()
    {
        numberOfLegs = 2;
        energy = 5;
    }

    public String walk()
    {
        energy -= 1;
        return "Struts like a pigeon";
    }

    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }
}

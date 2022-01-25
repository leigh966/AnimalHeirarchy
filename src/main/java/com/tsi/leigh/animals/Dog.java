package com.tsi.leigh.animals;

public class Dog extends Mammal implements LeggedAnimal
{
    private int numberOfLegs;

    public String walk()
    {
        energy -= 2;
        return "Walks like a dog";
    }

    public Dog()
    {
        numberOfLegs = 4;
        energy = 12;
    }

    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }
}

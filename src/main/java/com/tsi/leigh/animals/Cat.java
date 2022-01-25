package com.tsi.leigh.animals;

public class Cat extends Mammal implements LeggedAnimal
{
    private int numberOfLegs;
    String name = "Cat";

    public Cat()
    {
        energy = 20;
        numberOfLegs = 4;
    }

    public int getEnergy()
    {
        return energy;
    }

    public void Walk()
    {
        energy--;
        System.out.println("Walks like a cat");
    }

    @Override
    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }

    public String getName()
    {
        return name;
    }

}

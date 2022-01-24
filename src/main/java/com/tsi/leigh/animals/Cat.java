package com.tsi.leigh.animals;

public class Cat extends Mammal implements LeggedAnimal
{
    int numberOfLegs;
    String name = "Cat";

    public Cat()
    {
        numberOfLegs = 4;
    }

    public void Walk()
    {
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

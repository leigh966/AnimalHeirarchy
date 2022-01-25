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

    public String walk()
    {
        energy--;
        return "Walks like a cat";
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

    public String haveAccident(int numberOfLegsLost)
    {
        if(numberOfLegsLost <= numberOfLegs)
        {
            numberOfLegs -= numberOfLegsLost;
            return "Cat has lost " + numberOfLegsLost + " legs, " + numberOfLegs + " legs left";

        }
        else
        {
            return "That's not possible";
        }
    }

}

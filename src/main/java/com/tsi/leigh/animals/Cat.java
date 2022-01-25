package com.tsi.leigh.animals;

public class Cat extends Mammal implements LeggedAnimal
{
    private int numberOfLegs;

    public Cat()
    {
        energy = 20;
        numberOfLegs = 4;
        name = "Cat";
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

    public String haveAccident(int numberOfLegsLost)
    {
        if(numberOfLegsLost <= numberOfLegs && numberOfLegsLost >= 0)
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

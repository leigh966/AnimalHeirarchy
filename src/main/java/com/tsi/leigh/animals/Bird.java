package com.tsi.leigh.animals;

public abstract class Bird extends Animal  implements LeggedAnimal
{
    private int numberOfWings = 2;
    private int numberOfLegs = 2;
    public String reproduce()
    {
        return "Lays eggs";
    }

    @Override
    public boolean isWarmBlooded()
    {
        return true;
    }

    public int getNumberOfWings()
    {
        return numberOfWings;
    }

    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }

}

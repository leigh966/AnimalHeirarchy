package com.tsi.leigh.animals;

public abstract class Animal
{
    protected int energy;
    protected String name;
    public abstract String reproduce();
    public abstract boolean isWarmBlooded();
    public String getName()
    {
        return name;
    }
    public int getEnergy()
    {
        return energy;
    }
}

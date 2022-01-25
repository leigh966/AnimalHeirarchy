package com.tsi.leigh.animals;

public abstract class Bird extends Animal
{
    public String reproduce()
    {
        return "Lays eggs";
    }

    @Override
    public boolean isWarmBlooded()
    {
        return true;
    }
}

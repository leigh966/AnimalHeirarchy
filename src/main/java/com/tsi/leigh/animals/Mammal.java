package com.tsi.leigh.animals;

public abstract class Mammal extends Animal
{
    public String reproduce()
    {
        return "Births live young";
    }

    @Override
    public boolean isWarmBlooded()
    {
        return true;
    }
}
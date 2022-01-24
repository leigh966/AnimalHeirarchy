package com.tsi.leigh.animals;

public abstract class Mammal extends Animal
{
    public void reproduce()
    {
        System.out.println("Births live young");
    }

    @Override
    public boolean isWarmBlooded()
    {
        return true;
    }
}
package com.tsi.leigh.animals;

public class Main
{

    public static void main(String[] args)
    {
        Cat c = new Cat();
        System.out.println(c.reproduce());
        c.Walk();
        System.out.println(c.getName() + " has " + c.getNumberOfLegs() + " legs");
        if(c.isWarmBlooded())
        {
            System.out.println(c.getName() + " is warm blooded");
        }
        else
        {
            System.out.println(c.getName() + " is cold blooded");
        }
    }
}

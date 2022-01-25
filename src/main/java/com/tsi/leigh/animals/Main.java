package com.tsi.leigh.animals;

public class Main
{

    public static int main(String[] args)
    {

            Cat c = new Cat();
            System.out.println(c.reproduce());
            c.walk();
            System.out.println(c.getName() + " has " + c.getNumberOfLegs() + " legs");
            if(c.isWarmBlooded())
            {
                System.out.println(c.getName() + " is warm blooded");
            }

            return 0;

    }
}

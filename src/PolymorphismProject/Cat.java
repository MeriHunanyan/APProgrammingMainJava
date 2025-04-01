package PolymorphismProject;

import java.util.ArrayList;
import java.util.Random;

public class Cat extends Animal {
    private boolean lazy;
    private String animal = "Cat";
    Random random = new Random();
    public Cat(String name, int age, ArrayList<String> PersonalityTraits, boolean lazy)
    {
        super(name, age, PersonalityTraits);
        this.lazy = lazy;
    }

    public boolean getLazy()
    {
        return lazy;
    }
    public boolean isAsleep()
    {
        int randomNum = random.nextInt(10 - 1 + 1) + 1;
        if (lazy)
        {
            if (randomNum <= 8)
            {
                System.out.println(getName() + " is asleep.");
                return true;
            }
            System.out.println(getName() + " is not asleep.");
            return false;
        }
        if (randomNum <= 4)
        {
            System.out.println(getName() + " is asleep.");
            return true;
        }
        System.out.println(getName() + " is not asleep.");
        return false;
    }
    public String toString()
    {
        if (lazy){return super.toString()+ "" + this.getName() + " is lazy.";}
        return super.toString() + "" + this.getName() + " isn't lazy.";
    }

    public void makeSound()
    {
        System.out.println("meow meow meow");
    }

    public boolean equals(Object o)
    {
        if (o instanceof Dog)
        {
            Cat other = (Cat) o;
            return this.getName().equals(other.getName()) && this.getAge() == other.getAge() &&
                    this.getPersonality().equals(other.getPersonality()) && this.getLazy() == other.getLazy();
        }
        return false;
    }
}

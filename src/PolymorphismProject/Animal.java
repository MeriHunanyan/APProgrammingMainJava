package PolymorphismProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Animal {
    private String name;
    private int age;
    ArrayList<String> PersonalityTraits = new ArrayList<String>();
    private String animal = "animal";
    public Animal(String name, int age, ArrayList<String> personalityTraits)
    {
        this.name = name;
        this.age = age;
        this.PersonalityTraits = personalityTraits;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public ArrayList<String> getPersonality()
    {
        return PersonalityTraits;
    }
    @Override
    public String toString()
    {
        return animal + " with the name " + name
                + ". Whose age is " + age + ". And it is a very "
                + String.join(", ", PersonalityTraits) + " " + animal + ". ";
    }

    public void makeSound()
    {
        System.out.println("wsh wsh wsh wshhhhh");
    }
    public boolean equals(Object o)
    {
        if (o instanceof Animal)
        {
            Animal other = (Animal) o;
            return this.getName().equals(other.getName()) && this.getAge() == other.getAge() &&
                    this.getPersonality().equals(other.getPersonality());
        }
        return false;
    }
}

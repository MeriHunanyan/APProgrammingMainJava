package PolymorphismProject;

import java.util.ArrayList;

public class Dog extends Animal
{
    private String breed;
    private String animal = "Dog";
    public Dog(String name, int age, ArrayList<String> PersonalityTraits, String breed)
    {
        super(name, age, PersonalityTraits);
        this.breed = breed;
    }

    public String getBreed()
    {
        return breed;
    }

    public String toString()
    {
        return super.toString() + "The " + animal + "'s breed is " + breed;
    }
    @Override
    public void makeSound()
    {
        System.out.println("bark bark bark");
    }

    public boolean equals(Object o)
    {
        if (o instanceof Dog)
        {
            Dog other = (Dog) o;
            return this.getName().equals(other.getName()) && this.getAge() == other.getAge() &&
                    this.getPersonality().equals(other.getPersonality()) && this.getBreed().equals(other.getBreed());
        }
        return false;
    }
}

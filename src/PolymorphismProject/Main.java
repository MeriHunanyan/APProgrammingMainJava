package PolymorphismProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("energetic", "playful", "happy")) ;
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Winston", 4, input, true));
        animals.add(new Dog("Rocky", 3, input, "Labrador Retriever"));
        animals.add(new Cat("Winston", 4, input, true));

        for (Animal a : animals)
        {
            System.out.println(a); // prints description of the animal
            a.makeSound(); // they all make a sound
        }

        System.out.println("\nComparing books:");
        System.out.println("books.get(0) equals books.get(2): " + animals.get(0).equals(animals.get(2))); //true
        System.out.println("books.get(0) equals books.get(1): " + animals.get(0).equals(animals.get(1))); //false
    }
}

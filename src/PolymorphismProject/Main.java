package PolymorphismProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("energetic", "playfull", "happy")) ;
        Dog dog1 = new Dog("Rocky", 3, input, "Labrador Retriever");
        System.out.println(dog1);
    }
}

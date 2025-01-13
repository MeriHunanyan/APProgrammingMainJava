package Unit4;
import java.util.Random;

import java.util.Scanner;

public class Unit4HW1 {

    public static void main(String[] args) {
        //guessingGame();
        //tiredTurtle();
        notATamagotchi();
        int bob = 5;
        System.out.println(bob);
        bob = 8;


    }

    /**
     * Picks a random number between 1 and 100 and asks the user
     * to guess it. For each guess, the program should tell the user whether
     * the guess is too high, too low, or correct.
     *
     */
    public static void guessingGame() {
        //feel free to use the Random class
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Guess the number: ");
        int nowInt;
        while ((nowInt = scanner.nextInt()) != randomNumber) {
            if (nowInt > randomNumber)
            {
                System.out.println("Too high! Try again.");
            } else if(nowInt < randomNumber)
            {
                System.out.println("Too low! Try again.");
            } else
            {
                System.out.println("The guess you gave is either lower or higher then the range or is not a number");
            }
            System.out.println("Guess the number: ");
            System.out.println("Correct! You've guessed the right number!");
        }
    }
    /**
     * Tired Turtle
     * Asks the user how many steps they want the turtle to take in its
     * first move. Then it calculates and displays how many total steps
     * the turtle took until it stopped.
     *
     */
    public static void tiredTurtle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many steps should the turtle take in its first move?");
        int Step = 0;
        try {
            Step = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You did not enter an integer!");
        }

        int Total = Step;
        while (Step != 0)
        {
            Step =  Step / 2;
            Total = Total + Step;
        }
        System.out.println(Total);
    }



    /**
     * Not Tamagotchi
     * Ask the user if they want to feed the pet
     * If the pet's hunger level is above 40 they are unhappy
     * If user doesn't feed the pet will die
     * Simulation ends after 5 hours
     */
    public static void notATamagotchi(){
        Scanner scanner = new Scanner(System.in);
        boolean notTamagotchi = true;
        int hunger = 10;
        while (true)
        {
            notTamagotchi = true;
            for (int i = 1; i < 5 && notTamagotchi; i++)
            {
                System.out.println("Hour " + i + ": Current hunger level is " + hunger);
                if (hunger >= 40)
                {
                    System.out.println("Feed your animal soon, it is unhappy.");
                }
                System.out.println("Do you want to feed your pet? (yes/no): ");
                String userAns = scanner.nextLine();
                if (userAns.equals( "yes"))
                {
                    hunger = hunger - 25;
                    if (hunger < 0)
                    {
                        hunger = 0;
                    }
                } else if (hunger >= 40 && userAns.equals("no")) {
                    System.out.println("End of simulation. Your pet is dead.");
                    notTamagotchi = false;
                    System.out.println(" ------------------------------------------");
                } else if (userAns.equals("no"))
                {
                    ;
                } else
                {
                    System.out.println("You did not enter yes or no, try again:)");
                    i--;
                    continue;
                }
                hunger = hunger + 10;
            }
            if (notTamagotchi)
            {
                System.out.println("Hour 5: Current hunger level is " + hunger);
                System.out.println("End of simulation. Your pet is content.");
                System.out.println(" ------------------------------------------");
            }
            hunger = 10;
        }
    }

}
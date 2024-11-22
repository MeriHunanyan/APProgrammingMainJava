package DataFun;

import java.util.Scanner;

public class DataFun
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's you favourite number?: ");
        int UserNum = scanner.nextInt();

        if (UserNum < 0)
        {
            System.out.println("Your favourite number is negative!");
        } else
        {
            System.out.println("Your favourite number is positive");
        }

        if (UserNum < 10)
        {
            System.out.println("It's not bigger then 10");
        }else
        {
            if (UserNum > 100)
            {
                if (UserNum > 1000)
                {
                    System.out.println("It's bigger then 1000");

                } else
                {
                    System.out.println("It's bigger then 100");
                }
            } else
            {
                System.out.println("It's bigger then 10");
            }
        }

        if (UserNum % 2 == 0)
        {
            System.out.println("Your favourite number is even");
        } else
        {
            System.out.println("Your favourite number is odd");
        }
        switch(UserNum)
        {
            case 2:
                System.out.println("Helium");
                break;
            case 10:
                System.out.println("Neon");
                break;
            case 18:
                System.out.println("Argon");
                break;
            case 36:
                System.out.println("Krypton");
                break;
            case 54:
                System.out.println("Xenon");
                break;
            case 86:
                System.out.println("Radon");
                break;
            default:
                System.out.println("Not the atomic number of a nobal gas");
        }
        // Part 2
        scanner.nextLine();
        System.out.println("What's you favourite character?: ");
        String user_str = scanner.nextLine();

        boolean is_Letter = false;
        boolean is_uppercase = false;
        if (Character.isLetter(user_str.charAt(0)))
        {
            is_Letter = true;  // Set it to true if it's a letter
            if (Character.isUpperCase(user_str.charAt(0)))
            {
                System.out.println("Your favourite character is uppercase");
                is_uppercase = true;
            } else
            {
                System.out.println("Your favourite character is lowercase");

            }

            if (user_str == "a" || user_str == "e" || user_str == "i" || user_str == "o" || user_str == "u")
            {
                System.out.println("It's a vowel");
            } else
            {
                System.out.println("It's not a vowel");
            }
        } else if (Character. isDigit(user_str.charAt(0)))
        {
            System.out.println("Your favourite character is a number");
        } else
        {
            System.out.println("Your favourite character is a symbol");
        }
        char CharUser = user_str.charAt(0);
        int AsciiValue = (int) CharUser;
        System.out.println("This is the ASCII value of your character: " + AsciiValue);
        if (is_Letter)
        {
            if (is_uppercase)
            {
                int where = AsciiValue - 64;
                System.out.println("This is where your favourite character is in the alphabet: " + where);
            } else
            {
                int where = AsciiValue - 96;
                System.out.println("This is where your favourite character is in the alphabet: " + where);
            }
        }
    }
}

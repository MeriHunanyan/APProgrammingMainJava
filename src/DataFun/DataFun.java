package DataFun;

import java.util.Scanner;

public class DataFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's you favourite number?: ");
        int UserNum = scanner.nextInt();

        if (UserNum < 0) {
            System.out.println("Your favourite number is negative!");
        } else {
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

        if (UserNum % 2 == 0){
            System.out.println("Your favourite number is even");
        } else
        {
            System.out.println("Your favourite number is odd");
        }
        switch(UserNum) {
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

        // Part 2
        System.out.println("What's you favourite character?: ");
        String user_char = scanner.nextLine();

        if (Character.isLetter(user_char.charAt(0)))
        {
            if (Character.isUpperCase(user_char.charAt(0)))
            {
                System.out.println("Your favourite character is uppercase");
            } else if (Character.isLowerCase(user_char.charAt(0)))
            {
                System.out.println("Your favourite character is lowercase");
            }

            if (user_char == "a" || user_char == "e" || user_char == "i" || user_char == "o" || user_char == "u")
            {
                System.out.println("It's a vowel");
            } else
            {
                System.out.println("It's not a vowel");
            }
        } else if (Character. isDigit(user_char.charAt(0)))
        {
            System.out.println("Your favourite character is a number");
        } else
        {
            System.out.println("Your favourite character is a symbol");
        }

    }
}

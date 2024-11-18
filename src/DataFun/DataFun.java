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
        }
    }
}

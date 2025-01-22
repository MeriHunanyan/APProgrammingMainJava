package Woodle;

import java.util.Random;
import java.util.Scanner;

public class Woodle {
    public static int countOfChar(String s, Character ch)
    {
        int start = 0;
        int cnt = 0;
        while ((start = s.indexOf(ch, start)) != -1) {

            ++cnt;
            ++start;
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        int corPos;
        int corChar;
        String userAns;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] opt = {"DOLLY", "DOLLY"};
        int randI = random.nextInt(opt.length);
        String corAns = opt[randI];
        System.out.println("--------- Woodle ---------- ");
        while (true)
        {
            int start = 0;
            int end = corAns.length();
            corPos = 0;
            corChar = 0;
            System.out.println("Guess a 5 letter word");
            userAns = scanner.nextLine();
            for (int i = 0; i < 5; i++)
            {
                if (userAns.charAt(i) == corAns.charAt(i))
                {
                    corPos++;
                    continue;
                }

                corChar += Woodle.countOfChar(corAns, userAns.charAt(i));
            }
            System.out.println(corPos + " in correct location \n " + corChar + " correct letters");
        }
    }
}

package Unit4;


import java.util.Scanner;

public class Unit4HW2 {

    public static void main(String[] args) {
        //vowelCounter("The quick brown fox jumped over the lazy dog.");
        //System.out.println();
        //vowelCounter("AEIOU");
        //System.out.println();
        //palindromeChecker("level");
        //System.out.println();
        //palindromeChecker("abcde");
        //System.out.println();
        //palindromeChecker("racecar");
        //System.out.println();
        palindromeChecker("aBbA");
        //System.out.println();
        //extra credit
        //palindromeChecker("s*dfj*js");
        //System.out.println();
        //palindromeChecker("jf&fj");

    }

    public static void vowelCounter(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++ )
        {
            int range = "AEIOUaeiou".indexOf(str.charAt(i));
            if (range != -1)
            {
                ++count;
            }
        }
        System.out.println(count);
    }

    public static void palindromeChecker(String str)
    {
        int FirI = 0;
        int SecI = str.length() - 1;
        for (int midI = 0; midI < str.length() - 1 / 2; ++midI)
        {
            if (Character.isLetterOrDigit(FirI))
            {
                System.out.println("Error: Invalid character detected in " + str);
            }else if (str.charAt(FirI + midI) != str.charAt(SecI + midI))
            {
                System.out.println(str + " is not a palindrome");
                return;
            }
        }
        System.out.println(str + " is a palindrome");
    }
}


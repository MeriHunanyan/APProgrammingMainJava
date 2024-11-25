package Unit4;
// Name: Meri Hunanyan
// Date: 11/24/2024
// Assignment: Unit4HW2

public class Unit4HW2 {

    public static void main(String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("AEIOU");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("0a9a0");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");

    }
    /**
     * vowelCounter
     * Takes the input string and counts the number of each vowel inside it
     * prints the number of each vowel
     * returns nothing
     */
    public static void vowelCounter(String str)
    {
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++ )
        {
            int iVowel = "AEIOUaeiou".indexOf(str.charAt(i));
            if (iVowel != -1)
            {
                iVowel = iVowel % 5;
                switch (vowels.charAt(iVowel))
                {
                    case 'A':
                        ++aCount;
                        break;
                    case 'E':
                        ++eCount;
                        break;
                    case 'I':
                        ++iCount;
                        break;
                    case 'O':
                        ++oCount;
                        break;
                    case 'U':
                        ++uCount;
                        break;
                }
            }
        }
        System.out.println("Number of a's: " + aCount + "\nNumber of e's: " + eCount + "\nNumber of i's: " + iCount + "\nNumber of o's: " + oCount + "\nNumber of u's: " + uCount);
    }

    /**
     * Takes the input string and checks if it's a palindrome
     * if there is a character that's not a letter or a digit it
     * returns an error statement
     * If the input is valid it prints if it's a character or not
     * return nothing
     */
    public static void palindromeChecker(String str)
    {
        for (int i = 0; i < str.length() / 2; ++i)
        {
            if (!Character.isLetterOrDigit(str.charAt(i)) || (!Character.isLetterOrDigit(str.charAt(str.length() - 1 - i))))
            {
                System.out.println("Error: Invalid character detected in " + str);
                return;
            }
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                System.out.println(str + " is not a palindrome");
                return;
            }
        }
        System.out.println(str + " is a palindrome");
    }
}


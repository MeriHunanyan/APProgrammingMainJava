package madlibs;
import java.util.Scanner;

public class Madlib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String UserName = scanner.nextLine();

        System.out.println("""
                What's today's date: 
                month? """);
        int month = scanner.nextInt();

        System.out.println("day? ");
        int day = scanner.nextInt();

        System.out.println("year? ");
        int year = scanner.nextInt();

        System.out.println("""
                   Madlib: A day at the Zoo
                1. Adjective:
                2. Noun:
                3. Animal (plural):
                4. Verb (past tense):
                5. Adjective:
                6. Noun:
                
                Story: Today, I went to the zoo and saw a (1) (2). It was surrounded by (3) that (4) around it. The (5) zookeeper came over to feed the (2) some (6).""");

        System.out.println("1: ");
        String one = scanner.nextLine();
        System.out.println("2: ");
        String two = scanner.nextLine();
        System.out.println("3: ");
        String three = scanner.nextLine();
        System.out.println("4: ");
        String four = scanner.nextLine();
        System.out.println("5: ");
        String five = scanner.nextLine();
        System.out.println("6: ");
        String six = scanner.nextLine();

        System.out.println("Name: " + UserName + "\nDate: " + month + "/" + day + "/" + year + "\n\n" + "Today, I went to the zoo and saw a " + one + two + ". It was surrounded by " + three + " that " + four + "around it. The " + five + "zookeeper came over to feed the " + two + "some " + six + ".");
    }
}
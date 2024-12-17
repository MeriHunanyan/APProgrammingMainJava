package Zoolightsticket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Arrays;

public class Zoolightsticket
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        //ArrayList<String> FirstLast = new ArrayList<String>();
        //System.out.println("How many people are in the party?: ");
        //int Count = scanner.nextInt();
        //for (int i = 1; i < Count + 1; i++)
        //{
        //    System.out.println("First and Last name of " + i + " ?: ");
        //    FirstLast.add(scanner.nextLine());
        //}
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER"};
        System.out.println("When do you want to visit?(mm/dd/yy) : ");
        calendar.set(2024, Calendar.months[Integer.parseInt(substring(3,5))], );
        String date = scanner.nextLine();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }
}

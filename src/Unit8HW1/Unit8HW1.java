package Unit8HW1;
import java.util.Scanner;
public class Unit8HW1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //make your own 2D test array of integers (or whatever)
        int[][] integers = {{1, 2, 3},
                            {4, 5, 6}};
        //ask user for column number
        System.out.println("Which column do you want?: ");
        int userInput = scanner.nextInt();
        //make sure it is a valid option
        if (userInput > integers[0].length - 1 || userInput < 0)
        {
            System.out.println("This is not a valid column number");
            return;
        }
        //print the column number they asked for with each element on a new line
        columnPrinter(userInput, integers);
    }
    public static void columnPrinter(int columnNumber,int[][] arr){
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i][columnNumber]);
        }
    }
}
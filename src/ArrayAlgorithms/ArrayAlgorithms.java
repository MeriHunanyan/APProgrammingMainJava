package ArrayAlgorithms;
import java.util.Arrays;
public class ArrayAlgorithms {
    public static void main(String[] args) {
        // make a good test array
        int[] myArray = {5,8,-3,200,-10,5,-3};
        //call the method
        //System.out.println(findMin(myArray) == -10);
        System.out.println(Arrays.toString(shiftRight(myArray)));
        System.out.println(Arrays.toString(shiftLeft(myArray)));
        System.out.println(findAverage(myArray));
        System.out.println(Arrays.toString(reverseArray(myArray)));
    }

    // Finds the minimum value in an array
    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for(int num:array){
            if(num <= minValue){ //just in case someone has MAX_VALUE in here
                minValue = num;
            }
        }
        return minValue;
    }

    // Finds the maximum value in an array
    public static int findMax(int[] array) {
        int maxValue = array[0];
        for(int num:array){
            if(num >= maxValue){ //just in case someone has MAX_VALUE in here
                maxValue = num;
            }
        }
        return maxValue;
    }

    /*
    Finds the average of the values inside the given array

    parameters: int[] array

    output: double
     */
    public static double findAverage(int[] array) {
        int sum = 0;
        double avg = 0;
        for(int num:array)
        {
            sum = sum + num;
        }
        avg = (double) sum / array.length;
        return avg;
    }

    /*
    Shifts the array to the left by one position

    parameters: int[] array
    output: int[] array
     */
    public static int[] shiftLeft(int[] array) {
        for (int i = 0; i < array.length -1; i++)
        {
            array[i] = array[i+1];
        }
        array[array.length -1] = 0;
        return array;


    }

    /*
    Shifts the array to the right by one position

    parameters: int[] array
    output: int[] array
     */
    public static int[] shiftRight(int[] array) {
        int prev = 0;
        int cur_num = 0;
        for (int i = array.length -1; i > 0; i--)
        {
            array[i] = array[i-1];
        }
        array[0] = 0;
        return array;
    }

    /*
    Reverses a given array

    parameter: int[] array
    output: int[] array
     */
    public static int[] reverseArray(int[] array) {
        int n;
        int arLen = (int) array.length / 2 -1;
        System.out.println(arLen);
        for(int i = arLen; i >= 0; i--) {
            n = array[i];
            array[i] = array[(array.length-1) - i];
            array[(array.length-1) - i] = n;
        }
        return array;
    }
}
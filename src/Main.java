import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //This adds a new scanner.
        Scanner sc = new Scanner(System.in);
        //This defines the first arrayCounting number as 0. This indicates that the first input of the array will be in position 0.
        int arrayCounting = 0;
        //This activates the variable "arrayInput".
        int arrayInput;
        //This defines the array originalArray as a new integer array with 100 positions.
        int[] originalArray = new int[100];
        //This tells the user the rules and asks them to input the first value.
        System.out.println("The input '-1' will end the array's inputs. Please enter your first value:");
        //This defines the array input as their next integer input.
        arrayInput = sc.nextInt();
        //This stores the array input in the array in the 0th spot.
        originalArray[arrayCounting] = arrayInput;
        //This increases the array counting mechanism by 1, making the next spot be position 1 in the array.
        arrayCounting += 1;
        //This starts a "while" loop, executing the insides when the array input is not -1, as -1 ends the input cycle.
        while (arrayInput != -1) {
            //This prompts the user to input their desired value.
            System.out.println("Please enter your next value:");
            //This redefines the variable "arrayInput" as their new integer.
            arrayInput = sc.nextInt();
            //This stores the new array input in the array in the arrayCounting spot.
            // The first time in this loop it will be the 1st spot, 2nd time 2nd spot, and so on.
            originalArray[arrayCounting] = arrayInput;
            //This adds one to the array position counting mechanism.
            arrayCounting += 1;
        }
        //This starts a "for" loop, executing the interior when the variable "i" is greater than or equal to 0.
        // "i" starts at 99 and subtracts 1 each time. This is the beginning of the reversal section.
        for (int i = 99; i >= 0; i--) {
            //This starts an "if" statement, executing the insides when the original array in said spot is neither 0 nor -1.
            //This is because -1 ends the input and 0 is the default value for the unused array spots. 0 is also not a positive integer.
            if (originalArray[i] != 0 && originalArray[i] != -1) {
                //This prints out the value in the ith spot of the array.
                System.out.println(originalArray[i]);
            }
        }
        //This prints out the farewell message when the program is complete.
        System.out.println("Thanks for playing with us. Goodbye!");
    }
}
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your values. The input '-1' will end the array's inputs.");
        int arrayCounting = 0;
        int arrayInput = 1;
        int[] originalArray = new int[100];
        while (arrayInput != -1) {
            System.out.println("Please enter your next value:");
            arrayInput = sc.nextInt();
            originalArray[arrayCounting] = arrayInput;

            arrayCounting += 1;
        }

        //Reverser:
        //I is reverse counting mechanism
        for (int i = 99; i >= 0; i--) {
            if (originalArray[i] != 0 && originalArray[i] != -1) {
                System.out.println(originalArray[i]);
            }
        }
    }
}
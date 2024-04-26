import java.util.Scanner;

public class Chap5_exer_511 {
    /*5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
    Assume that the first value read specifies the number of values to input from the user. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many values will be used:");
        int count = input.nextInt();
        int[] numArray = new int[count];

        System.out.printf("Please enter %d numbers\n", count);
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = input.nextInt();
        }

        int smallest = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] < smallest) {
                smallest = numArray[i];
            }
        }
        System.out.printf("The smallest number is: %d\n", smallest);
        input.close();
    }
}

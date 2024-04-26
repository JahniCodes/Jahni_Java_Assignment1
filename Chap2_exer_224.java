import java.util.Scanner;
public class Chap2_exer_224 {
    public static void main(String[] args) {
        // Write an application that reads five integers and determines and prints the largest and smallest integers
        //  in the group. Use only the programming techniques you learned in this chapter.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int min = num1;
        int max = num1;
        input.close();
        
        if (num2 < min) {
            min = num2;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num5 < min) {
            min = num5;
        }
        if (num5 > max) {
            max = num5;
        }
        System.out.printf("Largest: %d\n", max);
        System.out.printf("Smallest: %d\n", min);
    }
}

import java.util.Scanner;
/**
 * Chap2_exer_216
 */
public class Chap2_exer_216 {

    public static void main(String[] args) {
        //2.16 (Comparing Integers) Write an application that asks the user to enter two integers,
        //obtains them from the user and displays the larger number followed by the words "is larger".
        //If the numbers are equal, print the message "These numbers are equal"

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your first integer: ");
        int num1 = input.nextInt();
        System.out.println("Please Enter your second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is Larger", num1);

        }else if ( num1 == num2 ){
            System.out.println("These numbers are equal");
        } else {
            System.out.printf("%d is Larger", num2);
        }
        input.close();
    }
}
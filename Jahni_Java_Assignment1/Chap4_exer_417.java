import java.util.Scanner;

public class Chap4_exer_417 {
    /*Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.
    The program should calculate and display the miles per gallon obtained for each trip and print the
    combined miles per gallon obtained for all trips up to this point.
    All averaging calculations should produce floating-point results.
    Use class Scanner and sentinel-controlled iteration to obtain the data from the user. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.println("Enter miles driven (-1 to exit): ");
            int miles = input.nextInt();
            if (miles == -1) {
                break;
            }

            System.out.println("Enter gallons used: ");
            int gallons = input.nextInt();


            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);


            totalMiles += miles;
            totalGallons += gallons;


            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f\n", combinedMpg);
        }

        input.close();
    }
}

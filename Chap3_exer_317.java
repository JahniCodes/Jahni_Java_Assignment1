import java.util.Scanner;
public class Chap3_exer_317 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("Please add a new patient.");
    System.out.println("Patients first name:");
    String firstName = input.nextLine();
    System.out.println("Patients last name:");
    String lastName = input.nextLine();
    System.out.println("Patients gender:");
    String gender = input.nextLine();

    int month = 0;
    while (true) {
        System.out.println("Patients month of birth (1 - January, 2 - February... 12 - December): ");
        month = input.nextInt();
        if (month >= 1 && month <= 12) {
            break;
        }
    }
    int day = 0;
    while (true) {
        System.out.println("Patients day of birth: ");
        day = input.nextInt();
        if (day >= 1 && day <= 31) {
            break;
        }
    }
    System.out.println("Patients year of birth: ");
    int year = input.nextInt();

    System.out.println("Patients height(in inches): ");
    double height = input.nextDouble();
    System.out.println("Patients weight (in pounds): ");
    double weight = input.nextDouble();

    DateOfBirth DoB = new DateOfBirth(month, day, year);
    HealthProfile newPatient = new HealthProfile(firstName, lastName, gender, DoB, height, weight);

    System.out.printf("Patient %s %s has been created.\n %s.\n %s", newPatient.getFirstName(), newPatient.getLastName(),newPatient.getHeartRate(), newPatient.getBMI());

    input.close();
    }
}

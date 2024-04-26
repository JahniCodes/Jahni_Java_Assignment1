import java.util.Scanner;
public class Chap3_exer_313 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner numinput = new Scanner(System.in);
        System.out.println("Please enter the first employees First name: ");
        String firstName = input.nextLine();

        System.out.println("Please enter the first employees Last name: ");
        String lastName = input.nextLine();

        System.out.println("Please enter the first employees monthly salary: ");
        double salary = numinput.nextDouble();

        Employee newEmployee1 = new Employee(firstName, lastName, salary);

        System.out.println("Please enter the second employees First name: ");
        firstName = input.nextLine();

        System.out.println("Please enter the second employees Last name: ");
        lastName = input.nextLine();

        System.out.println("Please enter the second employees monthly salary: ");
        salary = numinput.nextDouble();

        Employee newEmployee2 = new Employee(firstName, lastName, salary);

        System.out.printf("%s salary is $%.2f\n", newEmployee1.getFirstname(),newEmployee1.getSalary());
        System.out.printf("%s salary is $%.2f\n", newEmployee2.getFirstname(), newEmployee2.getSalary());

        System.out.println("Both employees qualify for a 10%% increase please see new monthly salaries: \n");
        newEmployee1.salaryRaise(10);
        newEmployee2.salaryRaise(10);


        System.out.printf("%s salary is $%.2f\n", newEmployee1.getFirstname(),newEmployee1.getSalary());
        System.out.printf("%s salary is $%.2f\n", newEmployee2.getFirstname(), newEmployee2.getSalary());



        input.close();
        numinput.close();
    }
}

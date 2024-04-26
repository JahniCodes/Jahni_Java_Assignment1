import java.util.Scanner;

public class Chap4_exer_420 {
    /*(Salary Calculator) Develop a Java application that determines the gross pay for each of three employees.
    The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours
    worked in excess of 40. You’re given a list of the employees, their number of hours worked last week and their hourly
    rates. Your program should input this information for each employee, then determine and display the employee’s gross
    pay. Use class Scanner to input the data */

    private String name;
    private double hoursWorked;
    private double hourlyRate;

    public Chap4_exer_420(String name, double hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    //GETTERS
    public String getName() {
        return this.name;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    //METHODS
    public double calculatePay() {
        if (this.hoursWorked > 40 ) {
            int regularWageHours = 40;
            double overtimeHours = this.hoursWorked - 40;
            double timeAndHalf = this.hourlyRate * 1.5;
            double grossPay = (double) (regularWageHours * this.hourlyRate) + (overtimeHours * timeAndHalf);
            return grossPay;
        } else {
            double grossPay = this.hourlyRate * this.hoursWorked;
            return grossPay;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter employee full name (leave blank to exit): ");
            String employeeName = input.nextLine();
            if (employeeName.isEmpty()) {
                break;
            }
              System.out.println("Input hours worked: ");
                double hoursWorked = input.nextDouble();
                System.out.println("Enter hourly wage: ");
                double hourlyRate = input.nextDouble();

                Chap4_exer_420 newEmployee = new Chap4_exer_420(employeeName, hoursWorked, hourlyRate);
                System.out.printf("%s's pay for this week is $%.2f\n", newEmployee.name, newEmployee.calculatePay());
                input.nextLine();
        }
        input.close();

    }
}

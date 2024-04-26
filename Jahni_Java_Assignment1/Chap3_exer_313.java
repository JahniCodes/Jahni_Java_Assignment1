public class Chap3_exer_313 {
    /*Create a class called Employee that includes three instance variables—a first name (type String),
     a last name (type String) and a monthly salary (double).
     Provide a constructor that initializes the three instance variables.
      Provide a set and a get method for each instance variable.
      If the monthly salary is not positive, do not set its value.
      Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
      Create two Employee objects and display each object’s yearly salary.
      Then give each Employee a 10% raise and display each Employee’s yearly salary again. */
    private String firstName;
    private String lastName;
    private double salary;

    public Chap3_exer_313(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //GETTERS
    public String getFirstname() {
        return this.firstName;
    }

    public String getLastname() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    //METHODS
    public double salaryRaise(double raiseAmount) {
        raiseAmount /= 100;
        this.salary += this.salary*raiseAmount;
        return this.salary;
    }

}

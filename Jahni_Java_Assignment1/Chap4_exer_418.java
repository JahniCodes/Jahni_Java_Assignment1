import java.util.Scanner;

public class Chap4_exer_418 {
    /*(Credit Limit Calculator) Develop a Java application that determines whether any of several department-store
    customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:
    1.account number
    2.balance at the beginning of the month
    3.total of all items charged by the customer this month
    4.total of all credits applied to the customer’s account this month
    5.allowed credit limit.
    The program should input all these facts as integers, calculate the new balance(= beginning balance + charges – credits)
    , display the new balance and determine whether the new balance exceeds the customer’s credit limit.
    For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded". */
    private int accountNumber;
    private int balance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    public Chap4_exer_418(int accountNumber, int balance, int totalCharge, int totalCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalCharges = totalCharge;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    //GETTERS

    public int getAccountNumber() {
        return accountNumber;
    }


    public int getBalance() {
        return balance;
    }


    public int getTotalCharges() {
        return totalCharges;
    }


    public int getTotalCredits() {
        return totalCredits;
    }


    public int getCreditLimit() {
        return creditLimit;
    }
    //SETTERS

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }


    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }


    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    //METHODS

    public void updateBalance() {
        this.balance += this.totalCharges - this.totalCredits;
        if (this.balance > this.creditLimit) {
            System.out.printf("New balance of: $%d. Credit Limit Exceeded", this.balance);

        } else {
            System.out.printf("New balance of: $%d.", this.balance);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter account information\n account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Current Balance: ");
        int balance = input.nextInt();
        System.out.println("This months charges: ");
        int totalCharges = input.nextInt();
        System.out.println("Amount of credits applied to account: ");
        int totalCredits = input.nextInt();
        System.out.println("Current credit limit: ");
        int creditLimit = input.nextInt();

        input.close();

        Chap4_exer_418 creditLimitCalculator = new Chap4_exer_418(accountNumber, balance, totalCharges, totalCredits,
                creditLimit);
        creditLimitCalculator.updateBalance();
    }

}

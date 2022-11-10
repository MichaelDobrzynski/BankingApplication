import java.util.Random;
import java.util.Scanner;

//abstract class, therefore won't be able to create objects from Account class, need to specify type of account
public abstract class Account implements BaseInterestRate {

    //List common properties for savings and checking account
    private String name;
    private String ssn;
    private Double balance;
    protected   String accountNumber;

    //variable for interest rates, actual interest rate calculated in inherited classes thanks to abstract method setRate
    protected double rate;

    //index to help with unique 5-digit numbers used for accounts
    private static int index = 10000;

    //variable to differentiate between Checking and Savings account types
    String accountType;

    //Constructor to set base properties and initialize account
    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();

        //implementation of respective abstract method
        setRate();
    }

    //abstract method forcing the inherited classes to set rate specific to account type
    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueFiveDigits = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        return lastTwoSsn + uniqueFiveDigits + randomNumber;
    }

    public void compoundInterest() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest for " + accountType + " account: $" + accruedInterest);
        printBalance();
    }

    //common methods for account transactions
    public void deposit(double amount) {
        System.out.println("Depositing $" + amount + " to " + name + "'s " + accountType + " account.");
        balance += amount;
        printBalance();
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing: $" + amount + " from " + name + "'s " + accountType + " account.");
        balance -= amount;
        printBalance();
    }

    public void transfer(String whereTo, double amount) {
        System.out.println("Transferring $" + amount + " from " + name + "'s " + accountType + " account to " + whereTo);
        balance -= amount;
        printBalance();
    }

    public void printBalance() {
        System.out.println("The balance of the " + accountType + " account for " + name + " is $" + balance + "\n");
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\n" +
                "SSN: " + ssn + "\n" +
                "Balance: $" + balance + "\n" +
                "Account Number: " + accountNumber);
        System.out.println("Interest rate: " + rate + "%");
    }

}

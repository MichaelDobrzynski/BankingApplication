import java.util.Random;

//abstract class, therefore won't be able to create objects from Account class, need to specify type of account
public abstract class Account implements BaseInterestRate {

    //List common properties for savings and checking account
    String name;
    String ssn;
    Double balance;
    String accountNumber;

    //variables for interest rates, actualRate calculated in inherited classes thanks to abstract method setRate
    double baseRate = getBaseRate();
    double actualRate;

    //index to help with unique 5-digit numbers used for accounts
    static int index = 10000;

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

    //common methods
    public void showInfo() {
        System.out.println("Name: " + name + "\n" +
                "SSN: " + ssn + "\n" +
                "Balance: $" + balance + "\n" +
                "Account Number: " + accountNumber);
        System.out.println("Interest rate: " + actualRate + "%");
    }

}

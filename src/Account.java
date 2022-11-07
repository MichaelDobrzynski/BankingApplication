import java.util.Random;

//abstract class, therefore won't be able to create objects from Account class, need to specify type of account
public abstract class Account implements BaseInterestRate {

    //List common properties for savings and checking account
    private String name;
    private String ssn;
    private Double balance;
    private String accountNumber;
    private double rate;

    //index to help with unique 5-digit numbers used for accounts
    static int index = 10000;

    //Constructor to set base properties and initialize account
    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;

        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Initial deposit: $" + initDeposit);

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println("Account Number: " + accountNumber);

        System.out.print("NEW ACCOUNT: ");
    }

    private String setAccountNumber() {
        String lastTwoSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueFiveDigits = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        return lastTwoSsn + uniqueFiveDigits + randomNumber;
    }

    //common methods


}

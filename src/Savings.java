public class Savings extends Account {

    //List properties specific to Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to init savings account properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT \n");

    }

    //list methods specific to savings account
    @Override
    public void calculateInterest() {

    }
}

public class Checking extends Account {

    //List properties specific to Checking Account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to init checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("NEW CHECKING ACCOUNT\n");

    }

    //list methods specific to checking account
    @Override
    public void calculateInterest() {

    }
}

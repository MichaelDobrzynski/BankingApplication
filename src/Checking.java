public class Checking extends Account {

    //List properties specific to Checking Account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to init checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        System.out.println("CHECKING \n");
    }

    //list methods specific to checking account
    @Override
    public void calculateInterest() {

    }
}

public class Savings extends Account {

    //List properties specific to Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to init savings account properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        System.out.println("SAVINGS \n");
    }

    //list methods specific to savings account
    @Override
    public void calculateInterest() {

    }
}

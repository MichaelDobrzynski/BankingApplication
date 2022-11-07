public class Savings extends Account {

    //List properties specific to Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to init savings account properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        accountType = "SAVINGS";
    }

    //list methods specific to savings account
    @Override
    public void calculateInterest() {

    }

    public void showInfo() {
        //thanks to super we get the info we need from the Account class before overriding here and adding account type
        super.showInfo();
        System.out.println("Account Type: " + accountType);
        System.out.println("*************************");
    }
}

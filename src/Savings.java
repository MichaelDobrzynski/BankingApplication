public class Savings extends Account {

    //List properties specific to Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to init savings account properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        accountType = "SAVINGS";

        setSafetyDepositBox();

    }

    //list methods specific to savings account
    @Override
    public void calculateInterest() {

    }

    public void showInfo() {
        System.out.println("Account Type: " + accountType);
        //thanks to super we get the info we need from the Account class before overriding here and adding account type
        super.showInfo();
        System.out.println(" Savings Account Features: " + "\n" +
                " Safety Deposit Box ID: " + safetyDepositBoxID + "\n" +
                " Safety Deposit Box Key: " + safetyDepositBoxKey);

        System.out.println("*************************");
    }

    //method to create ID and unique random key for safety deposit box of savings account
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
}

public class Checking extends Account {

    //List properties specific to Checking Account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to init checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        accountType = "CHECKING";
    }

    //list methods specific to checking account
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

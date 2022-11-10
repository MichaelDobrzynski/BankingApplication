public class Checking extends Account {

    //List properties specific to Checking Account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to init checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        accountType = "CHECKING";
        setDebitCard();
    }

    @Override
    public void setRate() {
        double baseRate = getBaseRate();
        rate = 0.15 * baseRate;
    }

    //list methods specific to checking account

    public void showInfo() {
        //thanks to super we get the info we need from the Account class before overriding here and adding account type
        super.showInfo();
        System.out.println("Account Type: " + accountType);
        System.out.println(" Checking Account Features: " + "\n" +
                " - Debit Card Number: " + debitCardNumber + "\n" +
                " - Debit Card: PIN: " + debitCardPin);
        System.out.println("*************************");
    }

    //method for setting debit card number and pin
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
}

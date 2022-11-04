//abstract class, therefore won't be able to create objects from Account class, need to specify type of account
public abstract class Account implements BaseInterestRate {

    //List common properties for savings and checking account
    private String name;
    private String ssn;
    private Double balance;
    private int accountNumber;
    private double rate;

    //Constructor to set base properties and initialize account
    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;

        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Initial deposit: $" + initDeposit);
        System.out.print("NEW ACCOUNT: ");
    }

    //common methods


}

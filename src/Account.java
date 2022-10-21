//abstract class, therefore won't be able to create objects from Account class, need to specify type of account
public abstract class Account implements BaseInterestRate {
    private String accountHolder;
    private int accountNumber;
    private String accountType;
    private Double balance;
}

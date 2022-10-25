public class Savings extends Account {

    //List properties specific to Savings Account

    //Constructor to init savings account properties
    public Savings(String name) {
        super(name);
        System.out.println("SAVINGS");
        System.out.println("Name: " + name);
    }

    //list methods specific to savings account
    @Override
    public void calculateInterest() {

    }
}

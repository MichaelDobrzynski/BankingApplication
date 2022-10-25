public class Checking extends Account {

    //List properties specific to Checking Account

    //Constructor to init checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("CHECKING");
        System.out.println("Name: " + name);
    }

    //list methods specific to checking account
    @Override
    public void calculateInterest() {

    }
}

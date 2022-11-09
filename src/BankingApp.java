public class BankingApp {

    public static void main(String[] args) {

        Checking checkAcc1 = new Checking("Rock Johnson", "123-45-6789", 1500);
        Savings saveAcc1 = new Savings("Geralt Sheperd", "987-65-4321", 2500);

        checkAcc1.showInfo();
        saveAcc1.showInfo();

        saveAcc1.deposit(500);
        saveAcc1.withdraw(250.25);
        saveAcc1.transfer("Friends account", 150);

        saveAcc1.compoundInterest();
        checkAcc1.compoundInterest();

        //Read CSV file then create new accounts based on that data

    }
}

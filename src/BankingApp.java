import java.util.List;

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
        String file = "C:\\Java\\JavaProjects\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}

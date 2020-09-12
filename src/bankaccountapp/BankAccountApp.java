package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
        // Read a CVS File then create new accounts based on that data
        String file = "C:\\Users\\admin\\Documents\\data.csv";
        List<String[]> newAccounts = utilities.CVS.read(file);
        for (String[] accountHolders : newAccounts) {
            System.out.println("NEW ACCOUNT: ");
            String name = accountHolders[0];
            String sSN = accountHolders[1];
            String accountType = accountHolders[2];
            double initDeposit = Double.parseDouble(accountHolders[3]);

            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for (Account account : accounts) {
            System.out.println("\n**************************");
            account.showInfo();
        }
    }
}
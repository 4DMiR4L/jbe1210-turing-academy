package az.turingacademy.module02.bankApp;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new SavingsAccount("Eli", 1000.0, 101, 0.02, 3);
        accounts[1] = new SavingsAccount("Veli", 500.0, 102, 0.03, 3);

        accounts[2] = new CurrentAccount("Cebi", 200.0, 201, 300.0);
        accounts[3] = new CurrentAccount("deli", 400.0, 202, 500.0);
        accounts[4] = new BankAccount("Felaket", 800.0, 301);
        System.out.println("Displaying Account Information:");
        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println("--------------------");
        }
        System.out.println("Testing Deposit and Withdraw:");
        accounts[0].deposit(200.0);
        accounts[1].withdraw(50.0);
        accounts[2].withdraw(400.0);
        accounts[3].withdraw(1000.0);
        accounts[4].deposit(100.0);

        System.out.println("--------------------");
        System.out.println("Testing Transfers:");
        accounts[0].transfer(accounts[4], 300.0);
        accounts[2].transfer(accounts[1], 100.0);

        System.out.println("--------------------");

        System.out.println("Testing Subclass-Specific Methods:");
        if (accounts[0] instanceof SavingsAccount) {
            ((SavingsAccount) accounts[0]).applyinterest();
        }

        if (accounts[2] instanceof CurrentAccount) {
            System.out.println("CurrentAccount overdraft testing completed.");
        }
    }
}

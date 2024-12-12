package az.turingacademy.module02.bankApp;

public class CurrentAccount extends BankAccount {
    private double overdraftlimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolder, balance, accountNumber);
        this.overdraftlimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftlimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount!");
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: " + overdraftlimit);
    }
}

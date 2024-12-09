package az.turingacademy.module02.bankApp;

public class SavingsAccount extends BankAccount {

    private double monthlyInterestRate;
    private int withdrawalLimit;

    public SavingsAccount(String accountHolder, int accountNumber, double balance, double monthlyinterestRate, int withdrawalLimit) {
        super(accountHolder, accountNumber, balance);
        this.monthlyInterestRate = monthlyinterestRate;
        this.withdrawalLimit = 3;
    }
    public void applyinterest() {
        double interest = getBalance() * monthlyInterestRate;
        deposit(interest);
        System.out.println("Interest of " + interest + " applied.");
    }
    @Override
    public void withdraw(double amount) {
        if (withdrawalLimit > 0) {
            if (amount > 0 && amount <= getBalance()) {
                super.withdraw(amount);
                withdrawalLimit--;
                System.out.println("Withdrawal successful. Remaining withdrawals: " + withdrawalLimit);
            } else {
                System.out.println("Insufficient balance or invalid amount!");
            }
        } else {
            System.out.println("Withdrawal limit reached for this month!");
        }
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + (monthlyInterestRate * 100) + "%");
        System.out.println("Remaining Withdrawals: " + withdrawalLimit);
    }
}



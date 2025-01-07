package az.turingacademy.module02.WalletApp;

public class Wallet {

    private int walletId;
    long userId;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }else {
            System.out.println("deposit failed");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }else {
            System.out.println("withdraw failed");
        }
    }

    public void showBalance() {
        System.out.println("balance: " + balance);
    }

    public Wallet(int walletId, long userId, double balance) {
        this.walletId = walletId;
        this.userId = userId;
        this.balance = balance;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

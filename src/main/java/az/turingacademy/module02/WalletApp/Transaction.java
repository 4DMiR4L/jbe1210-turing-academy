package az.turingacademy.module02.WalletApp;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime date;
    private Integer sourceWalletId;
    private Integer destinationWalletId;



    public Transaction(String type, double amount, LocalDateTime date, Integer sourceWalletId, Integer destinationWalletId) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.sourceWalletId = sourceWalletId;
        this.destinationWalletId = destinationWalletId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getSourceWalletId() {
        return sourceWalletId;
    }

    public void setSourceWalletId(Integer sourceWalletId) {
        this.sourceWalletId = sourceWalletId;
    }

    public Integer getDestinationWalletId() {
        return destinationWalletId;
    }

    public void setDestinationWalletId(Integer destinationWalletId) {
        this.destinationWalletId = destinationWalletId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", sourceWalletId=" + sourceWalletId +
                ", destinationWalletId=" + destinationWalletId +
                '}';
    }
}

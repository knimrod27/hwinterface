package Bankaccount;

public class BRD implements Bankinter{
    private double balance;

    public BRD(double balance) {
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        balance = balance + amount;

    }

    public void withdrawnAmount(double amount) {
        if(amount < balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient money in your account");
        }

    }
    public double getBalance() {
        return balance;
    }
}

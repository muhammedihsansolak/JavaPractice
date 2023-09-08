package coreJavaPractice.day35_Practice.bank_account;

public class BankAccount {

    private String accountHolder;
    private double balance;
    private int accountNumber;

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        if (accountHolder.length()<=0) return;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance<0){
            return;
        }
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolder, double balance, int accountNumber) {
        setAccountHolder(accountHolder);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=$" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public void deposit(double amount){
        if (amount<=0){
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance<=0){
            return;
        }
        balance -= amount;
    }
    public void checkBalance(){
        System.out.println(getBalance());
    }
}

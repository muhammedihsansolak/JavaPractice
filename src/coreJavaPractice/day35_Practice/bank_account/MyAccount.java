package coreJavaPractice.day35_Practice.bank_account;

public class MyAccount {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Maxwell Ian", 1000,553720310);
        System.out.println(myAccount);
        myAccount.deposit(150);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(50);
        myAccount.checkBalance();
    }
}

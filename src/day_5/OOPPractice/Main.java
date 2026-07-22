package day_5.OOPPractice;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Sarthak", 10000);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: ₹" + account.getBalance());

        // Valid deposit
        account.deposit(5000);

        // Valid withdrawal
        account.withdraw(3000);

        // Invalid withdrawal
        account.withdraw(20000);

        System.out.println("Final Balance: ₹" + account.getBalance());

        // Not allowed (Compilation Error)
        // account.balance = 100000;
    }
}

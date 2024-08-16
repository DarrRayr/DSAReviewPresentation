
// Bank Interface
interface Bank {
    public int returnBankBalance();
    public void withdrawMoney(int amount);
    public String returnAccountName();
}

// BankAccount class that implements the Bank Interface
public class BankAccount implements Bank {
    private int balance;
    private String accountName;
    // Constructor of BankAccount
    public BankAccount (int balance, String accountName) {
        this.balance = balance;
        this.accountName = accountName;
    }
    // returns the current bank balance
    public  int returnBankBalance() {
        return balance;
    }
    // Withdraw money from balance
    public void withdrawMoney(int amount) {
        balance = balance - amount;
    }
    // returns the Account Name
    public String returnAccountName() {
        return accountName;
    }
}

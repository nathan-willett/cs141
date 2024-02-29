package SmallProblems8B__3_1;

// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
    private String id;
    private double balance;
    private int transactions;
    
    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id) {}
    
    // returns the field values
    public double getBalance() {}
    public String getID() {}
    public String getTransactions() {}
    
    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {}
    
    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {}
 
    // your method would go here
    public void transfer(BankAccount receiver, double amount) {
        if (amount > 0.00) {
            if (amount + 5.00 <= balance) {
                withdraw(amount + 5.00);
                receiver.deposit(amount);
            } else {
                if (amount > 5.00) {
                    // partial transfer
                    receiver.deposit(balance - (amount - 5.00));
                }
            }
        }
    }
}

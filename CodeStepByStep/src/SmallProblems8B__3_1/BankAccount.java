// SMALL PROBLEMS 8B PART ONE [BankAccount-transfer]

package SmallProblems8B__3_1;

/* A BankAccount keeps track of a user's money balance and ID, and counts how many transactions 
(deposits/withdrawals) are made. */
public class BankAccount {
    private String id;          // added by 8A [BankAccount-transactionFee]
    private double balance;
    private int transactions;   // added by 8A [BankAccount-transactionFee]
    
    // Main Method
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount benben = new BankAccount("Benson", 17.25);
        
        // Call toString method and print the result
        System.out.println(benben.toString());
    }


    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id) {

    }
    

    // SMALL PROBLEMS 7B PART ONE [BankAccount-toString]
    /*
     * Add the following method to the BankAccount class:
     * 
     * public String toString()
     * 
     * Your method should return a string that contains the account's name and
     * balance separated by a
     * comma and space. For example, if an account object named benben has the name
     * "Benson" and a
     * balance of 17.25, the call of benben.toString() should return:
     * 
     * Benson, $17.25
     * 
     * There are some special cases you should handle. If the balance is negative,
     * put the - sign before the
     * dollar sign. Also, always display the cents as a two-digit number. For
     * example, if the same object had
     * a balance of -17.5, your method should return:
     * 
     * Benson, -$17.50
     */
    @Override
    public String toString() {
        String formattedBalance;
        // Check if the balance is negative and format accordingly
        if (balance < 0) {
            formattedBalance = String.format("-$%.2f", -balance);
        } else {
            formattedBalance = String.format("$%.2f", balance);
        }
        return name + ", " + formattedBalance;
    }


    // returns the field values
    public double getBalance() {

    }


    public String getID() {

    }


    public String getTransactions() {

    }
    

    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {

    }
    

    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {

    }


    // SMALL PROBLEMS 8A PART ONE [BankAccount-transactionFee]
    /*
     * The transactionFee method accepts a fee amount (a real number) as a
     * parameter, and applies that fee to the user's past transactions. The
     * fee is applied once for the first transaction, twice for the second
     * transaction, three times for the third, and so on. These fees are
     * subtracted out from the user's overall balance. If the user's balance
     * is large enough to afford all of the fees with greater than $0.00
     * remaining, the method returns true. If the balance cannot afford all
     * of the fees or has no money left, the balance is left as 0.0 and the
     * method returns false.
     */
    public boolean transactionFee(double fee) {
        double totalFee = 0;
        
        for (int i = 1; i <= transactions; i++) {
            totalFee += fee * i;
        }
        if (balance - totalFee > 0.00) {
            balance -= totalFee; // Deduct the total fee from the balance
            return true;
        } else {
            balance = 0.0; // Set the balance to 0.0 if the fees cannot be fully covered
            return false;
        }
    }


    // SMALL PROBLEMS 8B PART ONE [BankAccount-transfer]
    /*
     * Write a method named transfer that will be placed inside the BankAccount
     * class to become a part of each BankAccount object's behavior. The transfer
     * method moves money from this bank account to another account. The method
     * accepts two parameters: a second BankAccount to accept the money, and a
     * real number for the amount of money to transfer. There is a $5.00 fee for
     * transferring money, so this much must be deducted from the current account's
     * balance before any transfer. The method should modify the two BankAccount
     * objects such that "this" current object has its balance decreased by the
     * given amount plus the $5 fee, and the other BankAccount object's balance is
     * increased by the given amount. A transfer also counts as a transaction on
     * both accounts. If this account object does not have enough money to make the
     * full transfer, transfer whatever money is left after the $5 fee is deducted.
     * If this account has under $5 or the amount is 0 or less, no transfer should
     * occur and neither account's state should be modified.
     */
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

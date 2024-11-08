import java.util.ArrayList;
import java.util.List;

/**
 * The class Abstract account.
 */
public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    /**
     * Account.
     */
    public Account() {
        accountNumber = 0;
        balance = 0.0;
        transactionList = new ArrayList<>();
    }

    /**
     * Account.
     * @param accountNumber  the account number.
     * @param balance  the balance.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Do withdrawing.
     * @param amount  the amount.
     */
    public void doWithdrawing(double amount)
            throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > this.balance) {
            throw new InsufficientFundsException(amount);
        } else {
            this.balance -= amount;
        }
    }

    /**
     * Do depositing.
     * @param amount  the amount.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            this.balance += amount;
        }
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * getTransactionHistory.
     * @return String.
     */
    public String getTransactionHistory() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Lịch sử giao dịch của tài khoản " + accountNumber + ":\n");
        for (Transaction t : transactionList) {
            stringBuilder.append(t.getTransactionSummary());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
    /**
     * addTransaction.
     * @param transaction the Transaction.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account another = (Account) obj;
            return this.accountNumber == another.getAccountNumber();
        }
        return false;
    }
}

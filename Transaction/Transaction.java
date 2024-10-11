public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * It is a constructor.
     * @param operation  the operation.
     * @param amount  the amount.
     * @param balance  the balance.
     */
    public Transaction(String operation, double amount, double balance) {

        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }


    /**
     * Gets the operation.
     * @return the operation.
     */
    public String getOperation() {

        return operation;
    }


    /**
     * Sets the operation.
     * @param operation  the operation.
     */
    public void setOperation(String operation) {

        this.operation = operation;
    }


    /**
     * Gets the amount.
     * @return the amount.
     */
    public double getAmount() {

        return amount;
    }


    /**
     * Sets the amount.
     * @param amount  the amount.
     */
    public void setAmount(double amount) {

        this.amount = amount;
    }


    /**
     * Gets the balance.
     * @return the balance.
     */
    public double getBalance() {

        return balance;
    }


    /**
     * Sets the balance.
     * @param balance  the balance.
     */
    public void setBalance(double balance) {

        this.balance = balance;
    }
}

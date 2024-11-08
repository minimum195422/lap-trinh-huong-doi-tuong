public class SavingsAccount extends Account {

    /**
     * Savings account.
     */
    public SavingsAccount() {

        super();
    }

    /**
     * Savings account.
     * @param accountNumber  the account number.
     * @param balance  the balance.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdraw.
     * @param amount  the amount.
     */
    @Override
    public void withdraw(double amount) {
        try {
            if (amount > 1000.0) {
                throw new IllegalArgumentException("Illegal amount");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            if (this.balance < 5000.0) {
                throw new InsufficientFundsException();
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }

        double initialBalance = this.balance;
        try {
            doWithdrawing(amount);
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }

        this.transactionList.add(new Transaction(
                Transaction.TYPE_WITHDRAW_SAVINGS,
                amount,
                initialBalance,
                this.balance)
        );
    }


    /**
     * Deposit.
     * @param amount  the amount.
     */
    @Override
    public void deposit(double amount) {

        double initialBalance = this.balance;
        try {
            doDepositing(amount);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
            return;
        }

        this.transactionList.add(new Transaction(
                Transaction.TYPE_DEPOSIT_SAVINGS,
                amount,
                initialBalance,
                this.balance)
        );
    }
}

public class CheckingAccount extends Account {
    public CheckingAccount() {
    }

    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double initialBalance = this.balance;
        try {
            doWithdrawing(amount);
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }

        this.transactionList.add(new Transaction(
                Transaction.TYPE_WITHDRAW_CHECKING,
                amount,
                initialBalance,
                this.balance)
        );
    }

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
                Transaction.TYPE_DEPOSIT_CHECKING,
                amount,
                initialBalance,
                this.balance)
        );
    }
}

public class InsufficientFundsException extends BankException {

    /**
     * Insufficient funds exception.
     */
    public InsufficientFundsException() {
        super();
    }

    /**
     * Insufficient funds exception.
     * @param amount  the amount.
     */
    public InsufficientFundsException(double amount) {
        super(
                String.format(
                "Số dư tài khoản không đủ $%.2f để thực hiện giao dịch",
                amount));
    }
}

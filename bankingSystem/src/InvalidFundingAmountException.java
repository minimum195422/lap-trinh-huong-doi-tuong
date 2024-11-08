public class InvalidFundingAmountException extends BankException {

    /**
     * Invalid funding amount exception.
     */
    public InvalidFundingAmountException() {
        super();
    }

    /**
     * Invalid funding amount exception.
     * @param amount  the amount.
     */
    public InvalidFundingAmountException(double amount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", amount));
    }
}

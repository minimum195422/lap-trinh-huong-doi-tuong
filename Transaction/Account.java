import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * Deposit.
     * @param amount  the amount.
     */
    private void deposit(double amount) {

        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        this.balance += amount;
        transitionList.add(
                new Transaction(
                        Transaction.DEPOSIT, amount, this.balance));
    }


    /**
     * Withdraw.
     * @param amount  the amount.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        this.balance -= amount;
        transitionList.add(
                new Transaction(
                        Transaction.WITHDRAW, amount, this.balance));
    }


    /**
     * Add transaction.
     * @param amount  the amount.
     * @param operation  the operation.
     */
    public void addTransaction(double amount, String operation) {

        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }


    /**
     * Print transaction.
     */
    public void printTransaction() {

        for (int i = 0; i < transitionList.size(); ++i) {
            if (Objects.equals(transitionList.get(i).getOperation(), Transaction.DEPOSIT)) {
                System.out.printf(
                        String.format(
                                "Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n",
                                i + 1,
                                transitionList.get(i).getAmount(),
                                transitionList.get(i).getBalance()));
            } else if (Objects.equals(transitionList.get(i).getOperation(), Transaction.WITHDRAW)) {
                System.out.printf(
                        String.format(
                                "Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n",
                                i + 1,
                                transitionList.get(i).getAmount(),
                                transitionList.get(i).getBalance()));
            }
        }
    }
}

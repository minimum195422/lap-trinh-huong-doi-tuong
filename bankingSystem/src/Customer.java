import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * The class Customer.
 */
public class Customer {
    private long idNumber;
    private String fullName;
    private final List<Account> accountList;


    /**
     * It is a constructor.
     */
    public Customer() {
        this.idNumber = 0;
        this.fullName = "";
        this.accountList = new ArrayList<>();
    }


    /**
     * It is a constructor.
     * @param idNumber  the id number.
     * @param fullName  the full name.
     */
    public Customer(long idNumber, String fullName) {

        this.idNumber = idNumber;
        this.fullName = fullName;
        this.accountList = new ArrayList<>();
    }


    /**
     * Gets the customer info.
     * @return the customer info.
     */
    public String getCustomerInfo() {

        return "Số CMND: "
                + this.idNumber
                + ". Họ tên: "
                + this.fullName
                + ".";
    }


    /**
     * Add account.
     * @param account  the account.
     */
    public void addAccount(Account account) {

        for (Account accountCompare : accountList) {
            if (accountCompare.equals(account)) {
                accountCompare = account;
                return;
            }
        }
        accountList.add(account);
    }


    /**
     * Remove account.
     * @param account  the account.
     */
    public void removeAccount(Account account) {

        for (Account accountCompare : this.accountList) {
            if (Objects.equals(accountCompare, account)) {
                this.accountList.remove(accountCompare);
                break;
            }
        }
    }

    public long getIdNumber() {

        return idNumber;
    }

    public void setIdNumber(long idNumber) {

        this.idNumber = idNumber;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public List<Account> getAccountList() {

        return accountList;
    }
}

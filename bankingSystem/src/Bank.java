import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bank {

    private List<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }

    private boolean isNotEmpty() {
        if (this.customerList == null) {
            this.customerList = new ArrayList<>();
        }
        return !this.customerList.isEmpty();
    }

    /**
     * Read customer list.
     * @param inputStream  the input stream.
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        String readLine;

        if (sc.hasNextLine()) {
            readLine = sc.nextLine();
        } else {
            return;
        }

        while (sc.hasNextLine()) {
            assert readLine != null;
            String[] partsCustomer = readLine.split(" ");
            StringBuilder customerName = new StringBuilder();
            long customerId = 0;

            for (String part : partsCustomer) {
                char firstChar = part.charAt(0);
                if (!Character.isDigit(firstChar)) {
                    if (customerName.toString().isEmpty()) {
                        customerName.append(part);
                    } else {
                        customerName.append(" ").append(part);
                    }
                } else {
                    customerId = Long.parseLong(part);
                }
            }

            Customer newCustomer = new Customer(customerId, customerName.toString());

            while (
                    sc.hasNextLine()
                            && (readLine = sc.nextLine()) != null
                            && Character.isDigit(readLine.charAt(0))
            ) {
                String[] partsAccount = readLine.split(" ");

                long accountId = Long.parseLong(partsAccount[0]);
                String operation = partsAccount[1];
                double balance = Double.parseDouble(partsAccount[2]);

                try {
                    if (Objects.equals(operation, Account.CHECKING)) {
                        newCustomer.addAccount(new CheckingAccount(accountId, balance));
                    } else if (Objects.equals(operation, Account.SAVINGS)) {
                        newCustomer.addAccount(new SavingsAccount(accountId, balance));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println(e.toString());
                    return;
                }
            }

            int i = 0;
            while (i < customerList.size()) {
                if (customerList.get(i).getIdNumber() == customerId) {
                    for (Account account : newCustomer.getAccountList()) {
                        customerList.get(i).addAccount(account);
                    }
                    break;
                }
                i++;
            }

            if (i == customerList.size()) {
                customerList.add(newCustomer);
            }
        }
        sc.close();
    }

    /**
     * Gets the customers info by name order.
     * @return the customers info by name order.
     */
    public String getCustomersInfoByNameOrder() {
        if (this.isNotEmpty()) {
            customerList.sort(Comparator.comparing(Customer::getFullName));
            return customersInfoString();
        } else {
            return "";
        }
    }

    /**
     * Gets the customers info by identifier order.
     * @return the customers info by identifier order.
     */
    public String getCustomersInfoByIdOrder() {
        if (this.isNotEmpty()) {
            customerList.sort(Comparator.comparingLong(Customer::getIdNumber));
            return customersInfoString();
        } else {
            return "";
        }
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    private String customersInfoString() {
        StringBuilder customersInfo = new StringBuilder();
        for (Customer customer : customerList) {
            if (customersInfo.length() == 0) {
                customersInfo.append(customer.getCustomerInfo());
            } else {
                customersInfo.append("\n").append(customer.getCustomerInfo());
            }
        }

        return customersInfo.toString();
    }
}

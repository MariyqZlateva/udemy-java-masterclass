public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("You added " + depositAmount + ". After addition, your balance is " + balance + ".");
    }

    public void withdrawFunds(double withdrawAmount) {
        if (balance < withdrawAmount) {
            System.out.println("Your only have " + balance + " in account.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed, Remaining balance is " + balance + ".");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawFunds(100.0d);
        bankAccount.depositFunds(2000.0d);
        bankAccount.withdrawFunds(100.0d);
        System.out.println("Your balance is " + bankAccount.getBalance());
        bankAccount.withdrawFunds(1901.0d);

    }
}
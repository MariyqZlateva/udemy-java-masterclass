public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Default name", "Default@customer.com");
        System.out.println("Empty constructor called (with default values)");
    }

    public Customer(String name, String address) {
        this(name, 1000, address);
        System.out.println("Constructor with default credit limit");
    }

    public Customer(String name, double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = address;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

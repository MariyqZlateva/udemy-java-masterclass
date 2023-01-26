public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println(customer.getEmailAddress());
        System.out.println("Customer credit limit is " + customer.getCreditLimit());
        System.out.println(customer.getName());

        customer = new Customer("Bob Dash", 400.94, "bob@email.com");
        System.out.println(customer.getEmailAddress());
        System.out.println("Customer " + customer.getName() + " credit limit is " + customer.getCreditLimit());

        customer = new Customer();
        System.out.println(customer.getEmailAddress());
        System.out.println("Customer " + customer.getName() + " credit limit is " + customer.getCreditLimit());
    }
}
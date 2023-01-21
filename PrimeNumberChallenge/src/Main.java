public class Main {
    public static void main(String[] args) {

        System.out.println("5 is"+ (isPrime(5)?"": " NOT") + " a prime number");
        System.out.println("6 is"+ (isPrime(6)?"": " NOT") + " a prime number");

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return false;
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;

    }
}
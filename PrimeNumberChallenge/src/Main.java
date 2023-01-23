public class Main {
    public static void main(String[] args) {

        System.out.println("5 is" + (isPrime(5) ? "" : " NOT") + " a prime number");

        int counter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is prime number.");
                counter++;
                if (counter == 3){
                    System.out.println("Found 3 - exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return false;
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;

    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println(LastDigitChecker.hasSameLastDigit(-1, 99, 999));
        System.out.println(LastDigitChecker.isValid(-1));
        System.out.println(LastDigitChecker.isValid(9));
        System.out.println(LastDigitChecker.isValid(999));
        System.out.println(LastDigitChecker.isValid(1000));

    }
}

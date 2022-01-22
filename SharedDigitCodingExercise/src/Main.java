public class Main {
    public static void main(String[] args) {

        //        * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//        * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//        * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));
        System.out.println(SharedDigit.hasSharedDigit(0,55));
        System.out.println(SharedDigit.hasSharedDigit(3,55));

    }
}

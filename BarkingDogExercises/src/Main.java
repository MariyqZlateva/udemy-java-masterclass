public class Main {
    public static void main(String[] args) {

        boolean isBarking = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(isBarking);
        isBarking = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(isBarking);
         isBarking = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(isBarking);
       isBarking = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(isBarking);

    }
}

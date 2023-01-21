public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("++++");

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
        printWeekDay(10);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> " Monday";
            case 2 -> " Tuesday";
            case 3 -> " Wednesday";
            case 4 -> " Thursday";
            case 5 -> " Friday";
            case 6 -> " Saturday";
            default -> " invalid day of the week.";
        };
        System.out.println(day + " is " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        if (day < 0 || day > 6) {
            System.out.println(day + " is invalid day of the week.");
        }
        if (day == 0) {
            System.out.println(day + " is Sunday");
        }
        if (day == 1) {
            System.out.println(day + " is Monday");
        }
        if (day == 2) {
            System.out.println(day + " is Tuesday");
        }
        if (day == 3) {
            System.out.println(day + " is Wednesday");
        }
        if (day == 4) {
            System.out.println(day + " is Thursday");
        }
        if (day == 5) {
            System.out.println(day + " is Friday");
        }
        if (day == 6) {
            System.out.println(day + " is Saturday");
        }
    }
}
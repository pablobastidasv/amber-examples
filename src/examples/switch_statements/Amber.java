package examples.switch_statements;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.*;

public class Amber {

    public static void main(String[] args) {
        example1(MONDAY);
        example1(FRIDAY);

        // ======
        example2(MONDAY);
        example2(WEDNESDAY);

        // ======
        example3(THURSDAY);
        example3(WEDNESDAY);
    }

    private static void example1(DayOfWeek day) {
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(day + " has " + 6 + " letters.");
            case TUESDAY                -> System.out.println(day + " has " + 7 + " letters.");
            case THURSDAY, SATURDAY     -> System.out.println(day + " has " + 8 + " letters.");
            case WEDNESDAY              -> System.out.println(day + " has " + 9 + " letters.");
        }
    }

    private static void example2(DayOfWeek day) {
        int numberOfLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };

        System.out.println(day + " has " + numberOfLetters + " letters.");
    }
    private static void example3(DayOfWeek day) {
        int numberOfLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> {
                System.out.println("this day is special");
                yield 8;
            }
            case WEDNESDAY -> 9;
        };

        System.out.println(day + " has " + numberOfLetters + " letters.");
    }
}

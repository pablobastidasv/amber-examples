package examples.switch_statements;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.*;

public class Regular {

    public static void main(String[] args) {
        example1(MONDAY);
        example1(FRIDAY);

        // ======
        example2(MONDAY);
        example2(WEDNESDAY);
    }

    private static void example1(DayOfWeek day) {
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(day + " has " + 6 + " letters.");
                break;
            case TUESDAY:
                System.out.println(day + " has " + 7 + " letters.");
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println(day + " has " + 8 + " letters.");
                break;
            case WEDNESDAY:
                System.out.println(day + " has " + 9 + " letters.");
                break;
        }
    }

    private static void example2(DayOfWeek day) {
        int numberOfLetters;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numberOfLetters = 6;
                break;
            case TUESDAY:
                numberOfLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numberOfLetters = 8;
                break;
            case WEDNESDAY:
                numberOfLetters = 9;
                break;
            default:
                numberOfLetters = 0;
        }

        System.out.println(day + " has " + numberOfLetters + " letters.");
    }
}

package examples.records;

import java.time.LocalDate;

public class Regular {
    public static void main(String[] args) {
        var person = new AmberPerson("Scott", "Coleman", LocalDate.of(1980, 3, 2));

        System.out.println(person);
    }
}

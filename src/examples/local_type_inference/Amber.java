package examples.local_type_inference;

import examples.Test;
import examples.Utilities;
import org.jetbrains.annotations.NotNull;

public class Amber {
    public static void main(String[] args) {
        var myVar = Utilities.doSomething();

        for (var i : Utilities.sequence()) {
            System.out.println(i);
        }

        Utilities.sequence()
                .stream()
                .map((var i) -> i * 2)
                .forEach(System.out::println);

        Test test = (d1, d2) -> d1 * 2 < d2;
        Test test1 = (var d1, var d2) -> d1 * 2 < d2;
        Test test2 = (@NotNull var d1, var d2) -> d1 * 2 < d2;
    }

}

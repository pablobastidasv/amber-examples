package examples.local_type_inference;

import examples.Test;
import examples.Utilities;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Regular {
    public static void main(String[] args) {
        Map<String, List<Map.Entry<String, BigDecimal>>> myVar = Utilities.doSomething();

        for (Integer i : Utilities.sequence()) {
            System.out.println(i);
        }

        Utilities.sequence()
                .stream()
                .map((Integer i) -> i * 2)
                .forEach(System.out::println);

        Test test = (d1, d2) -> d1 * 2 < d2;
        Test test2 = (@NotNull Double d1, Double d2) -> d1 * 2 < d2;    }
}

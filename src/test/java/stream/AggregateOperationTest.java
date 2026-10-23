package stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {
    @Test
    void testAggregateOperations(){
        var optional = List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .max(Comparator.naturalOrder());
        optional.ifPresent(System.out::println);

        var optional2 = List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .min(Comparator.naturalOrder());
        optional2.ifPresent(System.out::println);
    }

    @Test
    void testReduceOperator(){
        List<Integer> list = List.of(1,2,3,4,5);
        var sum = list.stream()
                .reduce(0, (result, item)->result + item);
        System.out.println(sum);

        var factorial = list.stream()
                .reduce(1, (result, item)->result * item);
        System.out.println(factorial);
    }
}

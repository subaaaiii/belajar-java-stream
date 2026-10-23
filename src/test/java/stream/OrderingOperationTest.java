package stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .sorted()
                .forEach(System.out::println);
    }

    private Comparator<String> reverseComparator = Comparator.reverseOrder();

    @Test
    void testSortedWithComparator(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}

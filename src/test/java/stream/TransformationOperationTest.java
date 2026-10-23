package stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    void testMap(){
        List.of("Eko", "Kurniawan", "Khannedy").stream()
                .map(list-> list.length())
                .forEach(System.out::println);
    }
    @Test
    void testFlatMap(){
        List.of("Eko", "Kurniawan", "Khannedy").stream()
                .map(list->list.toUpperCase())
                .flatMap(upper -> Stream.of(upper,upper.length()))
                .forEach(System.out::println);
    }
}

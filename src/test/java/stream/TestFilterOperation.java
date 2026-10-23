package stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TestFilterOperation {
    @Test
    void testFilter(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .filter(name-> name.length()>5)
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9).stream()
                .filter(value->value>4)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct(){
        List.of("Subairi", "Eko", "Kurniawan","Subairi", "Ubi", "Anita", "Eko").stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    void testLimit(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .takeWhile(name->name.length() > 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .dropWhile(name->name.length() < 8)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny(){
        var optional = List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .findAny();
        optional.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst(){
        var optional = List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .findFirst();
        optional.ifPresent(System.out::println);
    }
}

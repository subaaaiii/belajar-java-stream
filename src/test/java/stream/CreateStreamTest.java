package stream;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream(){
        Stream<String> stream1 = Stream.empty();
        Stream<String> stream2 = Stream.of("Eko");
        Stream<String> stream3 = Stream.ofNullable(null);
    }

    @Test
    void testCreateStreamFromArray(){
        Stream<String> arrayStream = Stream.of("Eko", "Eka", "eki");
        arrayStream.forEach(data -> System.out.println(data));
        Stream<Integer> IntegerStream = Stream.of(1,2,3,4,5,6,7);
        IntegerStream.forEach(data -> System.out.println(data));


        String[] array = new String[]{
                "eko", "eki", "eka"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
    }

    @Test
    void testCreateStreamFromCollections(){
        Collection<String> list = List.of("Eko", "Khuurniawan");
        Stream<String> stringStream = list.stream();
        stringStream.forEach(System.out::println);

//        tidak bisa digunakan lagi karena sudah mengalir
//        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamInfinite(){
        Stream<String> stream = Stream.generate(()->"Subairi");
//        stream.forEach(System.out::println);
        Stream<Integer> stream2 = Stream.iterate(1, value -> value+1);
//        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Eko");
        builder.add("Kurniawan").add("Khannedy");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify(){
        Stream<Object> stream = Stream.builder().add("Eko").add("Kurniawan").add("Khannedy").build();
        stream.forEach(System.out::println);
    }
}


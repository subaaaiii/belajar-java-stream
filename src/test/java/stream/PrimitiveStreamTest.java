package stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {
    @Test
    void testPrimitiveStream(){
        IntStream intStream = IntStream.of(1,2,3,4,6);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.range(1,10);
        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.99).build();
    }

    @Test
    void testOperation(){
        IntStream intStream = IntStream.range(1,100);

        OptionalDouble avearage = intStream.average();
        avearage.ifPresent(System.out::println);

        IntStream.range(1,100)
                .mapToObj(number -> "Number: "+number)
                .forEach(System.out::println);
    }
}

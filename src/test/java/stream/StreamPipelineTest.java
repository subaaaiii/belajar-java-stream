package stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testCreateStreamPipelineNotOK(){
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy");
        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(a -> a.toUpperCase());
        Stream<String> mr = streamUpper.map(a->"Mr. "+a);
        mr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOK(){
        List.of("Eko", "Kurniawan", "Khannedy").stream()
                .map(list->list.toUpperCase())
                .map(upper-> "Mr. "+upper)
                .forEach(System.out::println);
    }
}

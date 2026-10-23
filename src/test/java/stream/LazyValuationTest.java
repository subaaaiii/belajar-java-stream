package stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;

public class LazyValuationTest {
    @Test
    void testIntermediateOperation(){
//        operation jenis intermediate bersift lazy
        List.of("Eko", "Kurniawan", "Khannedy").stream()
                .map(name -> {
                    System.out.println("tidak dijalankan");
                    return name.toUpperCase();
                });
    }
    @Test
    void testTerminalOperation(){
//        operation terminal seperti foreach akan menjalankan stream
//        data nya akan diproses satu persatu sesuai dengan konsep stream
        List.of("Eko", "Kurniawan", "Khannedy").stream()
                .map(name -> {
                    System.out.println("change " +name+ " to uppercase");
                    return name.toUpperCase();
                }).map(upper -> {
                    System.out.println("change " +upper+ " Mr.");
                    return "Mr. "+ upper;
                })
                .forEach(System.out::println);
    }
}

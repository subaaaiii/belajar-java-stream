package stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void notUsePeek(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .map(name -> {
                    System.out.println("Before change: "+name);
                    var upper = name.toUpperCase();
                    System.out.println("Change to: "+upper);
                    return upper;
                })
                .forEach(name-> System.out.println("After change:"+name));
    }

    @Test
    void usePeek(){
        List.of("Subairi", "Eko", "Kurniawan", "Ubi", "Anita").stream()
                .peek(name-> System.out.println("Before change: "+name))
                .map(name->name.toUpperCase())
                .peek(name-> System.out.println("Change to : "+name))
                .forEach(name -> System.out.println("After change: "+name));
    }
}

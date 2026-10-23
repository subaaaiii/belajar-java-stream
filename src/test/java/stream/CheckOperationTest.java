package stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {
    @Test
    void testAnyMatch(){
        boolean match = List.of(1,2,4,5,6,7,8,9).stream()
                .anyMatch(number -> number>8);
        System.out.println(match);
    }

    @Test
    void testAllMatch(){
        boolean match = List.of(1,2,4,5,6,7,8,9).stream()
                .allMatch(number -> number>0);
        System.out.println(match);
    }

    @Test
    void testNoneMatch(){
        boolean match = List.of(1,2,4,5,6,7,8,9).stream()
                .noneMatch(number -> number<0);
        System.out.println(match);
    }
}

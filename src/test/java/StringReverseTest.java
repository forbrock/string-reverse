
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {

    @org.junit.jupiter.api.Test
    void testStringReverse() {
        String test = "abcde";
        assertEquals("edcba", StringReverse.reverse(test));
    }
    
}

package JavaBrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringReverse {

    private StringReverse stringReverse = new StringReverse();

    @Test
    void testOne(){
        String givenSting = "asd";

        String expectedString = "dsa";

        Assertions.assertEquals(stringReverse.reverseString(givenSting), expectedString);
    }

    @Test
    void testMaualReverse(){
        String givenSting = "asd";

        String expectedString = "dsa";

        Assertions.assertEquals(stringReverse.reverseStringManual(givenSting), expectedString);
    }

    @Test
    void testEmptyString(){
        String givenSting = "";

        String expectedString = "";

        Assertions.assertEquals(stringReverse.reverseString(givenSting), expectedString);
    }

    @Test
    void testEmptyStringWithManualReverse(){
        String givenSting = "";

        String expectedString = "";

        Assertions.assertEquals(stringReverse.reverseStringManual(givenSting), expectedString);
    }
}

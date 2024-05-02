package flik;
import static org.junit.Assert.*;
import org.junit.Test;

public class HSTest {

    @Test
    public void simpleTest() {
        int a = 127;
        int acopy = 127;
        assertTrue(Flik.isSameNumber(a, acopy));

        int b = 128;
        int bcopy = 128;
        assertTrue(Flik.isSameNumber(b, bcopy));
    }
}

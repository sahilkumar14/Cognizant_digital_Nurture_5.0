import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {

    @Test
    public void testAssertions(){
        assertEquals(5,2+3);
        assertTrue(5 > 3);
        assertFalse(10 < 5);
        assertNull(null);
        assertNotNull(new Object());
    }
}

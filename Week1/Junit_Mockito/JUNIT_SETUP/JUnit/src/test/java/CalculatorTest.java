import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(8, cal.add(5,3));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, cal.sub(5,3));
    }

    @Test
    public void testMultiply(){
        assertEquals(30,cal.multiply(15,2));
    }

    @Test
    public void testDivide(){
        assertEquals(3, cal.divide(9,3));
    }
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setUp(){
        System.out.println("Setting up...");
        cal = new Calculator();
    }

    @After
    public void tearDown(){
        System.out.println("Cleaning up....");
        cal = null;
    }

    @Test
    public void testAdd(){
        int a = 10;
        int b = 20;

        int result = cal.add(10,20);
        assertEquals(30,result);
    }
}

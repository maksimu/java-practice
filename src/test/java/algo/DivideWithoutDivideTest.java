package algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideWithoutDivideTest {

    @Test
    public void testDivide() throws Exception {

        long divide = Long.valueOf(DivideWithoutDivide.divide(10, 2));
        assertEquals(5L, divide);


        long divide2 = Long.valueOf(DivideWithoutDivide.divide(10, 3));
        assertEquals(3, divide2);
    }
}
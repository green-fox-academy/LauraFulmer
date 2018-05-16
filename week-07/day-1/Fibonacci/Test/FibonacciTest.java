import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FibonacciTest {

    private Fibonacci fibonacciTest;

    @Before
    public void before() {
        fibonacciTest = new Fibonacci();
    }

    @Test
    public void letsTestFibonacciMember() {
        int inputForTest = 13;
        int expectedResult = 144;
        int actualResult = fibonacciTest.fibonacciMemberCounter(inputForTest);
        assertEquals(expectedResult, actualResult);
    }

}

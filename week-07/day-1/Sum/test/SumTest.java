import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumTest {

    private Sum numbers;

    @Before
    public void before() {
        numbers = new Sum();

    }

    @Test
    public void testSumming() {
        ArrayList inputs = new ArrayList(Arrays.asList(1, 2, 3, 4));
        int expectedResult = 10;
        int actualResult = numbers.summing(inputs);
        assertEquals(expectedResult, actualResult);
    }
}

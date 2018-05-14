import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplesTest {

    @Test
    public void isGetAppleIsEqualsApple() {
        String expectedWord = "apple";
        String resultWord = Apples.getApple();
        assertEquals(expectedWord, resultWord);
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    private Anagram test;

    @Before
    public void before() {
        test = new Anagram();
    }

    @Test
    public void testIfAnagram() {
        String word1 = "alma";
        String word2 = "alma";
        boolean result = test.isAnagram(word1, word2);
        assertEquals(true, result);
    }
}
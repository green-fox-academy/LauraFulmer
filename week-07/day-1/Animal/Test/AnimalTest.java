import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class AnimalTest {

    Animal animal = new Animal();


    @Test
    public void testDrinking() {
        int expectedThirtiness = 49;
        int actualThirtiness = animal.drink();
        assertEquals(expectedThirtiness, actualThirtiness);
    }

    @Test
    public void testEating() {
        int expectedHunger = 49;
        int actualHunger = animal.eat();
        assertEquals(expectedHunger, actualHunger);
    }

    @Test
    public void testPlaying() {
        int[] expectedLevels = {51, 51};
        int[] actualLevels = animal.play();
        assertArrayEquals(expectedLevels, actualLevels);
    }

    @Test
    public void testActualState() {
        int[] expectedLevels = {50, 50};
        int[] actualLevels = animal.actualHungerAndThirtiness();
        assertArrayEquals(expectedLevels, actualLevels);
    }
}

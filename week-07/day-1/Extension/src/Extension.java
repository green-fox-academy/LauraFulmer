import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    public int add(int a, int b) {
        return a + b;
    }

    public int maxOfThree(int a, int b, int c) {
        if (a > b || a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public double median(List<Integer> pool) {
        if (pool.size() % 2 == 1) {
            return pool.get((pool.size() - 1) / 2);
        } else {
            pool.sort(Integer::compareTo);
            int a = pool.get((pool.size() / 2) - 1);
            int b = pool.get(pool.size() / 2);
            return ((a + b) / 2);
        }
    }

    public boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    public String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}
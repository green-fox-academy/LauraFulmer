import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {
        String input1 = "kiscica";
        String input2 = "kiscica";

        System.out.println(anagram(input1, input2));
    }

    public static boolean anagram(String random1, String random2) {
        char tempArray1[] = random1.toCharArray();
        char tempArray2[] = random2.toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        String backToString1 = Arrays.toString(tempArray1);
        String backToString2 = Arrays.toString(tempArray2);

        boolean isAnagram;
        if (backToString1.equals(backToString2)) {
            isAnagram = true;
        } else {
            isAnagram = false;
        }
        return isAnagram;
    }
}

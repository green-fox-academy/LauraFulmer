import java.util.Arrays;

public class Anagram {
    String input1;
    String input2;

    public Anagram() {
    }

    public Anagram(String input1, String input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public static boolean isAnagram(String a, String b) {
        boolean iKnowTheseAreShittyNames = false;
        Character tempArrayA[] = new Character[a.length()];
        for (int i = 0; i < a.length(); i++) {
            tempArrayA[i] = a.charAt(i);
        }

        Character tempArrayB[] = new Character[b.length()];
        for (int i = 0; i < b.length(); i++) {
            tempArrayB[i] = b.charAt(i);
        }
        Arrays.sort(tempArrayA);

        Arrays.sort(tempArrayB);

        if (Arrays.equals(tempArrayA, tempArrayB) ) {
            iKnowTheseAreShittyNames = true;
        } else {
            iKnowTheseAreShittyNames = false;
        }

        return iKnowTheseAreShittyNames;
    }
}

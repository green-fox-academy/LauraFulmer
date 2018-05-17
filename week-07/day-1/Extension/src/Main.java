import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Extension extension = new Extension();

        System.out.println(extension.isVowel('b'));
        System.out.println(extension.maxOfThree(1, 3, 2));
        System.out.println(extension.median(Arrays.asList(7, 5, 3, 5)));
        System.out.println(extension.translate("lagopus"));

    }
}

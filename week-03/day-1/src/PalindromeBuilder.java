public class PalindromeBuilder {
    public static void main(String[] args) {

        String randomInput = "java";
        System.out.println(createPalindrome(randomInput));
    }

    public static String createPalindrome(String input) {
        for (int i = (input.length() - 1); 0 <= i; i--) {
            input += input.charAt(i);
        }
        return input;
    }
}

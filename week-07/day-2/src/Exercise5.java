public class Exercise5 {
    public static void main(String[] args) {

        String forSelectingUppercase = "ertgDrtgGUdcB";

       forSelectingUppercase.chars()
                .filter(c -> c < 97)
                .mapToObj(c -> Character.toString((char) c))
                .forEach(System.out::println);

    }
}

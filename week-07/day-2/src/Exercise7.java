import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Exercise7 {
    public static void main(String[] args) {
        String randomString = "blablabladfgh";
        Map<Character, Integer> letters = randomString.chars().boxed()
                .map(
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,
                Integer::sum)
                .collect(Collectors.toMap());
        System.out.println(letters);
    }
}
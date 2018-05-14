import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        ArrayList<Integer> input;
        input = new ArrayList<Integer>(1, 11, 34, 11, 52, 61, 1, 34);
        Arrays.sort(input);
        System.out.println(unique(input));
    }

    public static ArrayList<Integer> unique(Integer[] numbers) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer number : numbers) {
            if (Collections.frequency(numbers, number) == 1) {
                uniqueList.add(number);
            }
        }

        return uniqueList;
}

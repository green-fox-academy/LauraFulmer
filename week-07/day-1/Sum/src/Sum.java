import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {

    }

    ArrayList<Integer> numbersToAdd;

    public static int summing(ArrayList<Integer> inputNumbers) {
        int result = 0;
        for (int i : inputNumbers) {
            result += i;
        }
            return result;
    }

}

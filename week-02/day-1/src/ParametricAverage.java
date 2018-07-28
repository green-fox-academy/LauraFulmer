import java.util.Arrays;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("How many numbers do want to count with?");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        int[] numbersToCount = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Give me a number: ");
            int newNumber = scanner.nextInt();
            numbersToCount[i] = newNumber;
        }

        System.out.println(sum(numbersToCount));
        System.out.println(average(numbersToCount));
    }

    public static int sum(int[] inputs) {
        int sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i];
        }
        return sum;
    }

    public static int average(int[] inputs) {
        int average = 0;
        return (sum(inputs) / inputs.length);
    }
}

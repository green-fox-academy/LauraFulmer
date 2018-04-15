import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Give me a number:");
        Scanner scanner1 = new Scanner(System.in);
        double number1 = scanner1.nextDouble();

        System.out.println("Give me a second number:");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();

        System.out.println("Give me a third number:");
        Scanner scanner3 = new Scanner(System.in);
        double number3 = scanner3.nextDouble();

        System.out.println("Give me a fourth number:");
        Scanner scanner4 = new Scanner(System.in);
        double number4 = scanner4.nextDouble();

        System.out.println("Give me a fifth number:");
        Scanner scanner5 = new Scanner(System.in);
        double number5 = scanner5.nextDouble();

        System.out.println("Sum: " + (number1 + number2 + number3 + number4 + number5) + ", Average: " + ((number1 + number2 + number3 + number4 + number5)/5));
    }
}

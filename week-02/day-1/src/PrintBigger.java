import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

    // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Give me a number:");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        System.out.println("Give me another number:");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }

    }
}

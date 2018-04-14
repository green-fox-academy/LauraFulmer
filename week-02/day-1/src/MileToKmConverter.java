import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

     System.out.println("Give me a distance in km you would like to convert:");
     Scanner scanner = new Scanner(System.in);
     int distance = scanner.nextInt();
     System.out.println("It is " + (distance * 0.621371) + " miles.");
    }
}
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        // System.out.println("How many layers would you like to have in the pyramid?");

        System.out.println("How big pyramid would you like to have?");
        Scanner scanner = new Scanner(System.in);
        int pyramid = scanner.nextInt();

        String whitespace = " ";
        String star = "*";

        for (int i = 0; i < pyramid; i++) {
            for (int j = pyramid; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}
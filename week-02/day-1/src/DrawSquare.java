import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("How big square would you like to have?");
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();

        System.out.println("%%%%%");

        for (int i = 0; i < square - 2; i++) {
            System.out.println("%   %");
        }

        System.out.println("%%%%%");
    }
}

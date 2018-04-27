import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("How big square would you like to have?");
        Scanner scanner = new Scanner(System.in);
        int diagonal = scanner.nextInt();

        for (int i = 1; i <= diagonal; i++) {
            if (i == 1 || i == diagonal) {
                for (int k = 0; k <= diagonal; k++) {
                    System.out.print("%");
                }
                System.out.println("");
            } else {
                System.out.print("%");
                for (int j = 0; j <= diagonal - 2; j++) {
                    if (j == i - 1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("%");
                System.out.println();
            }
        }
    }
}

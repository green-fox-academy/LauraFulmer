import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("How big diamond would you like to have?");
        Scanner scanner = new Scanner(System.in);
        int diamond = scanner.nextInt();

            if (diamond % 2 == 0){
                System.out.println("It has to be an odd number:");
                scanner = new Scanner(System.in);
                diamond = scanner.nextInt();
            }


    }
}

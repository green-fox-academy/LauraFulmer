import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("How many chickens has the farmer?");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();

        System.out.println("How many pigs has the farmer?");
        Scanner scanner2 = new Scanner(System.in);
        int pig = scanner.nextInt();

        System.out.println("They have " + ((chicken * 2) + (pig * 4)) + " legs.");
    }
}
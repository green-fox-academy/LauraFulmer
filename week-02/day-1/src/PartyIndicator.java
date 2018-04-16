import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        System.out.println("How many girls come to the party?");
        Scanner scannerGirls = new Scanner(System.in);
        int numberGirls = scannerGirls.nextInt();

        System.out.println("How many boys come to the party?");
        Scanner scannerBoys = new Scanner(System.in);
        int numberBoys = scannerBoys.nextInt();

        if ( (numberGirls == numberBoys) && ((numberGirls + numberBoys) > 20)) {
            System.out.println("The party is exellent!");
        } else if ((numberBoys != numberGirls) && ((numberGirls + numberBoys) > 20)) {
            System.out.println("Quite cool party!");
        } else if ((numberGirls + numberBoys) < 20) {
            System.out.println("Average party...");
        } else if (numberGirls == 0) {
            System.out.println("Sausage party");
        }
    }
}


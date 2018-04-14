public class Cuboid {
    public static void main(String[] args) {

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

    double a = 3.2;
    double b = 4.3;
    double c = 5.4;

    System.out.println("Surface Area: " + ((2 * a * b) + (2 * a * c) + (2 * b * c)));
    System.out.println("Volume: " + (a * b * c));

    }
}

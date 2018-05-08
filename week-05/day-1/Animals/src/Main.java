import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal.animals.add(animal1);
        animal.animals.add(animal2);

        animal1.eat();

        System.out.println(animal1.actualHunger);



    }
}

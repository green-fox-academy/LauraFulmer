import java.util.ArrayList;
import java.util.List;

public class Animal {

    static int hunger = 50;
    static int thirst = 50;

    List<Animal> animals;

    public Animal() {
        animals = new ArrayList<>();
    }

    public int eat() {
        hunger--;
        return hunger;
    }

    public int drink() {
        thirst--;
        return thirst;
    }

    public int[] play() {
        hunger++;
        thirst++;
        return new int [] {hunger, thirst};
    }

    public int[] actualHungerAndThirtiness(){
        return new int[] {hunger, thirst};
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animals=" + animals +
                '}';
    }
}
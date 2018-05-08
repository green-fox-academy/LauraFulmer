import java.util.ArrayList;
import java.util.List;

public class Animal {

    static int hunger = 50;
    static int thirst = 50;

    List<Animal> animals;

    public Animal() {
    animals =new ArrayList<>();
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

    public int actualHunger(){
        return hunger;
    }

}

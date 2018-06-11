import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Character {
    static int maxHP;
    static int currentHP;
    static int dP;
    static int sP;
    static int d6;
    static int level;
    ArrayList<Integer> possibleCoordinates;

    public Character() {
    }

    public Character(int maxHP, int dP, int sP) {
        this.maxHP = maxHP;
        this.dP = dP;
        this.sP = sP;

        this.level = 1;
        this.d6 = (int) (Math.random() * 6 + 1);
        this.possibleCoordinates = new ArrayList<>();
      //  possibleCoordinates.add(new ArraysList<Integer>(0, 72, 144, 216, 288, 360, 432, 504, 576, 648));

    }

    public int getCoordinates(int[] possibleCoordinates, int coordinateX, int CoordinateY) {
     //   this.coordinateX = possibleCoordinates.get((new Random()).nextInt(possibleCoordinates.size()));
        return coordinateX;
     //   this.coordinateY = possibleCoordinates.get((new Random()).nextInt(possibleCoordinates.size()));
      //  return coordinateY;
    }
}
public class Hero extends Character {
    public Hero(int healthPoint, int defendPoint, int strikePoint) {
        super(healthPoint, defendPoint, strikePoint);

        this.maxHP = 20 + (3 * d6);
        this.dP = 2 * d6;
        this.sP = 5 + d6;


    }
}

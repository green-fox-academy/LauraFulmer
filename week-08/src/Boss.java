public class Boss extends Character {
    public Boss(int healthPoint, int defendPoint, int strikePoint) {
        super(healthPoint, defendPoint, strikePoint);

        this.maxHP = 2 * level * d6 + d6;
        this.dP = level / 2 * d6 + d6 / 2;
        this.sP = level * d6 + level;
    }
}

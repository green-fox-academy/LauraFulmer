public class Monster extends Character {
    public Monster(int healthPoint, int defendPoint, int strikePoint) {
        super(healthPoint, defendPoint, strikePoint);

        this.maxHP = 2 * level * d6;
        this.dP = level / 2 * d6;
        this.sP = level + d6;


      //  public void drawMonster() {

       // }

    }




}

public class RangedWeapon extends Weapon {
    private int ammunition;

    public RangedWeapon (String name, String longName, int ammunition) {
        super (name, longName);
        this.ammunition = ammunition;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int minusAmmunition) {
        ammunition -= minusAmmunition;
    }
}

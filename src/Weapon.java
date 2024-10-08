public class Weapon extends Item {

    public Weapon(String name, String longName) {
        super(name, longName);
    }

    @Override
    public String toString() {
        return getName() + ", " + getLongName() + ".";
    }
}

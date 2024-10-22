
import java.util.ArrayList;
import java.util.List;

class Player implements ISaveable {

    private String name;
    private int strength;
    private int hitPoints;
    private String weapon;

    public Player(String name, int strength, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public List<String> write() {

        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        values.add(3, weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues == null) {
            return;
        }
        if (savedValues.size() <= 0) {
            return;
        }
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
        weapon = savedValues.get(3);
    }

    public String toString() {
        return "Player{"
                + "name='" + name + '\''
                + ", hitPoints=" + hitPoints
                + ", strength=" + strength
                + ", weapon='" + weapon + '\''
                + '}';
    }

}

class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public List<String> write() {

        ArrayList<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues == null) {
            return;
        }
        if (savedValues.size() <= 0) {
            return;
        }
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
    }

    public String toString() {
        return "Monster{"
                + "name='" + name + '\''
                + ", hitPoints=" + hitPoints
                + ", strength=" + strength
                + '}';
    }

}

interface ISaveable {

    List<String> write();

    void read(List<String> savedValues);
}

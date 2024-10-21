
import java.util.List;

class player implements ISaveable {

    private String name;
    private String weapon;
    private int strength;
    private int hitpoints;

    public player(String name, int strength, int hitpoints) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getStrength() {
        return strength;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = "Sword";
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHitPoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public List<String> write() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'write'");
    }

    @Override
    public void read(List<String> values) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

}

class monter {

}

interface ISaveable {

    List<String> write();

    void read(List<String> values);
}

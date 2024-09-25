public class Monster {
    String name;
    String description;
    int armorClass;
    int healthPoints;
    
    public Monster(String name, int armorClass, int healthPoints) {
        this.name = name;
        this.armorClass = armorClass;
        this.healthPoints = healthPoints;
    }

    public Monster (String name, String description, int armorClass, int healthPoints) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getAC() {
        return armorClass;
    }

    public int getHP() {
        return healthPoints;
    }

    public void setHP(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}


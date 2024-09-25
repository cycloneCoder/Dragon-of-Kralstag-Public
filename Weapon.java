public class Weapon {
    private String weight;
    private String name;
    private String description;
    private int damage;

    public Weapon() {}

    public Weapon (String name) {
        this.name = name;
    }

    public Weapon (String name, String weight, String description, int damage) {
        this.name = name;
        this.weight = weight; 
        this.description = description;
        this.damage = damage;
    }
    
    public void setName(String weaponName) {
        this.name = weaponName;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public int getDamage() {
        return damage;
    }

    public String describeWeapon() {
        name = name.toLowerCase();

        if (name.startsWith("a") || name.startsWith("e") || name.startsWith("i")
        || name.startsWith("o") || name.startsWith("u")) {
            return "This is an " + name.substring(0,1).toUpperCase() + name.substring(1) + ". " + "It is " + description + ". " + 
            "It is " + weight + " and it does " + damage + " damage.";
        } else {
            return "This is a " + name.substring(0,1).toUpperCase() + name.substring(1) + ". " + "It is " + description + ". " + 
            "It is " + weight + " and it does " + damage + " damage.";
        }
    }

}

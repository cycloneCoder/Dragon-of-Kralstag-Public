public class Player {
    private String playerName;
    private int healthPoints;
    private int armorClass;


    public Player(int hp, int ac) {
        this.healthPoints = hp;
        this.armorClass = ac;
    }

    public String getPlayerName () {
        return playerName;
    } 

    public void setHP(int healthPoints) {
        this.healthPoints = healthPoints;  
    }  

    public int getHP() {
        return healthPoints;
    }

    public int getAC() {
        return armorClass;
    }

    public void setAC(int armorClass) {
        this.armorClass = armorClass;
    }
}


public class Character {
    State state;
    String name;
    int level;
    double exp;
    double healthPoints;
    double expToLevelUp;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
        this.healthPoints = 10;
        this.expToLevelUp = 20;
        state = new NoviceState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String showStats() {
        return "Name:" + this.name + "\n" +
                "Health: " + this.healthPoints + "\n" +
                "Exp to next level: " + this.exp + "/" + this.expToLevelUp +
                "\n" + "Level: " + this.level + "\n";

    }


    public void levelUp() {
        this.level++;
        System.out.println("You level up to " + this.level);
        this.expToLevelUp *= 1.5;
        this.exp = 0;
    }


}

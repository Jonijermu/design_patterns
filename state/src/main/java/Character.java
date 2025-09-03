public class Character {
    State state;
    String name;
    int level;
    double exp;
    double healthPoints;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.healthPoints = 10;
        state = new NoviceState(this);
    }

    public void start() {
        System.out.println(showStats());
        state.train();

    }

    public void setState(State state) {
            this.state = state;
    }

    public String showStats() {
        return "Name:"+ this.name+"\n" +
        "Health: "+ this.healthPoints+"\n" +
        "Level: "+ this.level+"\n";

    }

    public void userChoice() {

    }

    public void levelUp() {
        this.level++;
        System.out.println("You level up to " + this.level);
        this.exp = 0;

    }

    public void rest() {
        this.healthPoints = 10;
        System.out.println("Your hp is full now");
    }

}

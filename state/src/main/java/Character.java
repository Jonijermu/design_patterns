public class Character {
    State state;
    String name;
    int level;
    double exp;
    double healthPoints;

    public Character(String name) {
        this.name = name;
        this.level = 0;
        this.healthPoints = 10;
        state = new NoviceState(this);
    }

    public void setState(State state) {
            this.state = state;
    }

    public void levelUp() {

    }
}

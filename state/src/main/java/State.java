

public abstract class State {
    protected Character character;

    public State(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    abstract void train(Character character);
    abstract void meditate(Character character);
    abstract void fight(Character character);



}



public abstract class State {
    protected Character character;

    public State(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    abstract void train();
    abstract void meditate();
    abstract void fight();



}

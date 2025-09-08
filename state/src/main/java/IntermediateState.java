

public class IntermediateState extends State {


    public IntermediateState(Character character) {
        super(character);
    }

    @Override
    public void train(Character character) {
        System.out.println(character.name + " is training and gains 10 exp.");
        character.exp += 10;
        if (character.exp >= character.expToLevelUp) {
            character.levelUp();
            character.setState(new ExpertState(character));

        }
    }

    @Override
    void meditate(Character character) {
        System.out.println("character meditate and gains 10hp");
        character.healthPoints += 10;

    }

    @Override
    void fight(Character character) {
        System.out.println("Cannot fight at Intermediate level!");
    }
}

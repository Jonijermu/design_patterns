public class NoviceState extends State {

    public NoviceState(Character character) {
        super(character);
    }

    @Override
    public void train(Character character) {
        System.out.println(character.name + " is training and gains 10 exp.");
        character.exp += 10;
        if (character.exp >= character.expToLevelUp) {
            character.levelUp();
            character.setState(new IntermediateState(character));

        }
    }

    @Override
    public void meditate(Character character) {
        System.out.println("Cannot meditate at Novice level!");

    }

    @Override
    public void fight(Character character) {
        System.out.println("Cannot fight at Novice level!");
    }


}

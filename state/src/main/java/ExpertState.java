public class ExpertState extends State {


    public ExpertState(Character character) {
        super(character);
    }


    @Override
    public void train(Character character) {
        System.out.println(character.name + " is training and gains 10 exp.");
        character.exp += 10;
        if (character.exp >= character.expToLevelUp) {
            character.levelUp();
            character.setState(new MasterState(character));

        }
    }

    @Override
    void meditate(Character character) {
        System.out.println(character.name + " meditates and gains 10 HP.");
        character.healthPoints += 10;
    }

    void fight(Character character) {
        System.out.println(character.name + " fights! Gains 15 EXP, loses 5 HP.");
        character.exp += 15;
        character.healthPoints -= 5;
        if (character.exp >= character.expToLevelUp) {
            character.levelUp();
            character.setState(new MasterState(character));
        }
    }
}

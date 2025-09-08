public class MasterState extends State{

    public MasterState(Character character) {
        super(character);
    }
        @Override
        public void train(Character character) {
            System.out.println(character.name + " is training and gains 10 exp.");
            character.exp += 10;
            if (character.exp >= character.expToLevelUp) {
                character.levelUp();


        }
    }

    @Override
    void meditate(Character character) {

    }

    @Override
    void fight(Character character) {

    }
}

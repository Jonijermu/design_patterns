package tiles;

public class SwampTile implements Tile {


    @Override
    public void action() {
        System.out.println("You entered a Swamp.");
    }

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getDescription() {
        return "Swamp Tile";
    }

}

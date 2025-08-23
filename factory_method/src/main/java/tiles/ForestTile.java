package tiles;

public class ForestTile implements Tile {

    @Override
    public void action() {
        System.out.println("You entered a Road.");
    }

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getDescription() {
        return "Forest Tile";
    }
}


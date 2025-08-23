package tiles;

public class BuildingTile implements Tile {

    @Override
    public void action() {
        System.out.println("You entered a building.");
    }

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getDescription() {
        return "Building Tile";
    }
}

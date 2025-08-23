package tiles;

public class RoadTile implements Tile {


    @Override
    public void action() {
        System.out.println("You entered a building.");
    }

    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getDescription() {
        return "Road Tile";
    }

}

package tiles;

public class WaterTile implements Tile {


    @Override
    public void action() {
        System.out.println("You entered a Water.");
    }

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getDescription() {
        return "Water Tile";
    }

}

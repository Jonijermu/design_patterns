public class File implements FileSystemElement{

    String name;
    int sizeMb;


    public File(String name, int sizeMb) {
        this.name = name;
        this.sizeMb = sizeMb;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
    visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return sizeMb;
    }
}

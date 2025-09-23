import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory implements FileSystemElement {

    List<FileSystemElement> elements = new ArrayList<>();
    String name;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public String getName() {
        return name;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Part> parts;

    public Computer() {
        this.parts = new ArrayList<>();
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Part p : parts) {
            sb.append(p.getName());
            sb.append("\n");
        }
        return sb.toString();
    }


}

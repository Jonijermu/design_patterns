import java.util.ArrayList;
import java.util.List;

public class Department extends Component {

    List<Component> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void printData() {
        System.out.println("Department: " + this.name);
        for (Component child : this.children) {
            child.printData();
        }

    }

    @Override
    public void add(Component component) {
        this.children.add(component);

    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);

    }

    @Override
    public Component getChild(int index) {
        return this.children.get(index);
    }

    @Override
    public double getTotalSalary() {
        double total = 0;
        for (Component child : children) {
            total += child.getTotalSalary();
        }
        return total;
    }


}

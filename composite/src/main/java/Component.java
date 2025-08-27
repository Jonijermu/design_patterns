
public abstract class Component {

    String name;

    public Component(String name) {
        this.name = name;

    }

    public abstract void printData();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int index);

    public abstract double getTotalSalary();

    public abstract String toXML(int indentLevel);
}

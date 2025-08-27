

public class Employee extends Component {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printData() {
        System.out.println("Employee: " + this.name + " Salary: " + this.salary);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "   ".repeat(indentLevel);
        return indent + "<Employee name=\"" + name +"\" salary=\"" + salary +"\" />\n";
    }
}

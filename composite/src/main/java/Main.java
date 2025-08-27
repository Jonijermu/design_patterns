public class Main {

    public static void main(String[] args) {

        Component department1 = new Department("1");
        Component department2 = new Department("2");
        Component department3 = new Department("3");
        Component department4 = new Department("4");
        Component department5 = new Department("5");

        Component employee1 = new Employee("John", 2500);
        Component employee2 = new Employee("Pekka", 2400);
        Component employee3 = new Employee("Marko", 3500);
        Component employee4 = new Employee("Liisa", 4000);
        Component employee5 = new Employee("marja", 1750);


        department1.add(employee5);
        department3.add(employee1);
        department4.add(employee2);
        department5.add(employee3);
        department5.add(employee4);

        department1.add(department2);
        department1.add(department3);
        department1.add(employee5);

        department2.add(department4);
        department2.add(department5);

        department1.printData();

        System.out.println("Total salary: " + department1.getTotalSalary());
        department3.remove(employee1);
        System.out.println("Total salary after removal: " + department1.getTotalSalary());

        System.out.println(department1.toXML(0));

    }
}
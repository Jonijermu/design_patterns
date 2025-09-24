public class Main {
    public static void main(String[] args) {

        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructGamingComputer();
        director.constructOfficeComputer();
        Computer specks = builder.getComputer();
        System.out.println(specks);


    }
}
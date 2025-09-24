public class ComputerDirector{

    ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructGamingComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildGraphicsCard();
        builder.buildOperatingSystem();
    }

    public void constructOfficeComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildGraphicsCard();
        builder.buildOperatingSystem();
    }

}

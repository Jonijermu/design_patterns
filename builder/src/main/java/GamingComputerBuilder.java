public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }


    @Override
    public void buildProcessor() {
        computer.addPart(new Part("Intel Core i9-13900K (24 cores, up to 5.8 GHz)"));
    }

    @Override
    public void buildRAM() {
        computer.addPart(new Part("64GB DDR5 6000MHz"));
    }

    @Override
    public void buildHardDrive() {
        computer.addPart(new Part("2TB NVMe Gen4 SSD + 8TB HDD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addPart(new Part("NVIDIA GeForce RTX 4090 24GB GDDR6X"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addPart(new Part("Windows 11 Pro (Optimized for Gaming)"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

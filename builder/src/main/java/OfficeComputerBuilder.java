public class OfficeComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addPart(new Part("Intel Core i5-13400 (10 cores, up to 4.6 GHz)"));
    }

    @Override
    public void buildRAM() {
        computer.addPart(new Part("16GB DDR4 3200MHz"));
    }

    @Override
    public void buildHardDrive() {
        computer.addPart(new Part("512GB NVMe SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addPart(new Part("Integrated Intel UHD Graphics 730")); // no need for a monster GPU
    }

    @Override
    public void buildOperatingSystem() {
        computer.addPart(new Part("Windows 11 Pro (Productivity Edition)"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

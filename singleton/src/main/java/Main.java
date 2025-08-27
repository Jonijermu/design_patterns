import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();
        System.out.println(logger);
        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        Logger logger2 = Logger.getInstance();
        logger2.write("prööt");
        System.out.println(logger);
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close();
    }
}
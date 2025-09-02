import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        Logger logger = Logger.getInstance();
        System.out.println(logger);
        logger.setFileName("new_log.txt");
        logger.write("Simulation started");
        Logger logger2 = Logger.getInstance();
        logger2.write("prööt");
        System.out.println(logger);
        logger2.write("Processing data...");
        logger2.write("Simulation finished");
        logger2.close();
    }
}
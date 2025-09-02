import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private FileWriter myWriter;
    private static Logger instance;

    private Logger() {
        try {
            setFileName("default_log.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String name) {
        try {
            myWriter = new FileWriter(name, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String text) {
        try {
            myWriter.write(text + System.lineSeparator());
            myWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void close() {
        try {
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

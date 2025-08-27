import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private FileWriter myWriter;
    private static Logger instance;

    public Logger() {

    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;

    }

    public void setFileName(String name) throws IOException {
       myWriter = new FileWriter(name, true);

    }

    public void write(String text) throws IOException {
        myWriter.write(text + System.lineSeparator());
        myWriter.flush();
    }

    public void close() {

    }
}

import java.util.Iterator;

public class FibonacciSequence implements Secuence {
    public FibonacciSequence() {

    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}

import java.util.Iterator;
import java.util.function.Consumer;

public class FibonacciIterator implements Iterator<Integer> {

    int current =1;
    int newCurrent;
    int previous= 0;
    int next = 1;
    int count =0;


    public FibonacciIterator() {}

    @Override
    public boolean hasNext() {
       return count <= 10;
    }

    @Override
    public Integer next() {
        next = current;
        newCurrent = previous + current;
        previous = current;
        current = newCurrent;
        count++;
        return next;
    }

}

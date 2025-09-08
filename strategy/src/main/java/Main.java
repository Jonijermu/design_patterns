import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        long startTime;
        long endTime;

        for (int i = 0; i < 100000; i++) {
            int randomNum = (int) (1 + (Math.random() * 99));
            numbers.add(randomNum);
        }
        System.out.println("Original List");
        //System.out.println(numbers);

        SortingContext sortingContext = new SortingContext(new InsertionSort());

        startTime = System.nanoTime();
        sortingContext.sort(numbers);
        endTime = System.nanoTime();
        System.out.println("Sort Time: " + (endTime - startTime) / 1_000_000_000.0 + " seconds");

    }

}
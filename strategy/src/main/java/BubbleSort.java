import java.util.List;

public class BubbleSort implements SortingStrategy {
    int i, j, temp;
    boolean swapped;
    Long startTime = System.nanoTime();

    public BubbleSort() {

    }

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        int n = numbers.size();
        for (i = 0; i < n - 1; i++) {
            swapped = false; // Track if any swap happened in this pass

            for (j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if out of order
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Store numbers[j] in temp.
                    temp = numbers.get(j);
                    // Replace numbers[j] with numbers[j+1].
                    numbers.set(j, numbers.get(j + 1));
                    // Replace numbers[j+1] with temp.
                    numbers.set(j + 1, temp);
                    swapped = true; // Mark that a swap occurred

                }
            }
            // If no swaps occurred, the list is sorted
            if (!swapped) break;
        }
        return numbers;

    }
}

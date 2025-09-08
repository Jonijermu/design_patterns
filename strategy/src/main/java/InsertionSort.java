import java.util.List;

public class InsertionSort implements SortingStrategy {

    int n, i, j, key;

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        n = numbers.size(); // Get the size of the list

        // Start from index 1 (since index 0 is already "sorted" by itself)
        for (i = 1; i < n; i++) {
            key = numbers.get(i);   // Current element to be inserted
            j = i - 1;              //comparing with the previous element

            // Shift elements of the sorted part (left side) that are greater than key
            while (j >= 0 && numbers.get(j) > key) {
                numbers.set(j + 1, numbers.get(j)); // Move element one step to the right
                j = j - 1;   // Move left to continue checking
            }

            // Place the key in its correct sorted position
            numbers.set(j + 1, key);
        }

        return numbers;
    }
}

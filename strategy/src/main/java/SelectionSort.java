import java.util.List;

public class SelectionSort implements SortingStrategy {
    int i, j, temp;
    int minIdx;

    public SelectionSort() {
    }

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        int n = numbers.size();

        // Outer loop: move the boundary of the sorted/unsorted part
        for (i = 0; i < n - 1; i++) {
            minIdx = i; // assume the first element of unsorted part is the minimum

            // Inner loop: find the index of the smallest element in the unsorted part
            for (j = i + 1; j < n; j++) {
                if (numbers.get(j) < numbers.get(minIdx)) {
                    minIdx = j; // update minIdx if smaller element found
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            temp = numbers.get(i);
            numbers.set(i, numbers.get(minIdx));
            numbers.set(minIdx, temp);
        }

        return numbers;
    }
}

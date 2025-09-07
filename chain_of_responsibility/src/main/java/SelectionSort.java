import java.util.List;

public class SelectionSort implements SortingStrategy {
    int i, j, temp;
    int minIdx;

    public SelectionSort() {

    }

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        int n = numbers.size();
        for (i = 0; i < n - 1; i++) {
            minIdx = i;

            for (j = i + 1; j < n; j++) {
                if (numbers.get(j) < numbers.get(minIdx)) {
                    minIdx = j;
                }
            }
            temp = numbers.get(i);
            numbers.set(i, numbers.get(minIdx));
            numbers.set(minIdx, temp);

        }
        return numbers;
    }
}

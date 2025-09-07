import java.util.List;

public class BubbleSort implements SortingStrategy {
    int i, j, temp;
    boolean swapped;

    public BubbleSort() {

    }

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        int n = numbers.size();
        for (i = 0; i < n - 1; i++) {
            swapped = false;

            for (j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {

                    temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                    swapped = true;

                }
            }
            if (swapped == false) break;
        }
        return numbers;

    }
}

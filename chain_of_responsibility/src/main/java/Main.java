import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int randomNum = (int) (1 + (Math.random() * 99));
            numbers.add(randomNum);
        }
        System.out.println(numbers);

        SortingContext sortingContext = new SortingContext(new BubbleSort());
        SortingContext sortingContext2 = new SortingContext(new SelectionSort());
        System.out.println(sortingContext.sort(numbers));
        System.out.println(sortingContext2.sort(numbers));

    }

}
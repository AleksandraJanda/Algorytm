import java.util.Arrays;

public class MainSelectionSort {

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SelectionSort();
        Integer[] array = new Integer[]{5,7,2,9,4,6};
        Integer[] result = sortingAlgorithm.sort(array);
        Arrays.stream(result)
                .forEach(x-> System.out.println(x));
    }
}

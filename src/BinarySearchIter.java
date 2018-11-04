import java.util.List;

public class BinarySearchIter<T extends Comparable<T>>
        implements SearchAlgorithm<T> {
    @Override
    public Integer search(T value, List<T> input) {
        return null;
    }
    @Override
    public Integer search(T value, T[] input) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (input[mid].compareTo(value) > 0) {
                high = mid - 1;
            } else if (input[mid].compareTo(value) < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

import java.util.Arrays;
import java.util.List;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = Arrays.copyOf(input,input.length);
        for(int i = 0; i<=result.length-2; i++){
            int min = i;
            for(int j = i+1; j<result.length; j++){
                if(result[j]<result[min]){
                    min = j;
                }
            }
            int temp = result[i];
            result[i]=result[min];
            result[min]=temp;
        }
        return result;
    }
}

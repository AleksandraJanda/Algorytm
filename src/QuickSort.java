import java.util.List;

public class QuickSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        return quickSort(input,0,input.length);
    }

    public Integer[] quickSort(Integer[] input, int left, int right){
        int mid = (left+right)/2;
        int j = left;
        int pivot = input[mid];
        input[mid] = input[right];
        for(int i = left; i<right; i++){
            if(input[i]<pivot){
                Integer temp = input[i];
                input[i] = input[j];
                input[j]=temp;
                j++;
            }
        }
        input[right] = input[j];
        input[j] = pivot;
        if(left<j-1){
            quickSort(input,left,j-1);
        }
        if(j+1<right){
            quickSort(input,j+1,right);
        }
        return input;
    }
}

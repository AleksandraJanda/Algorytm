import java.util.Arrays;
import java.util.List;

public class MergeSort implements SortingAlgorithm{

    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        return mergeSort(input,0,input.length-1);
    }

    public Integer[] mergeSort(Integer[] input, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(input,l,m);
            mergeSort(input,m+1,r);
            input = merge(input,l,m,r);
        }
        return input;
    }
    public Integer[] merge(Integer[] input, int l, int m, int r){
        Integer[] temp = new Integer[input.length];
        int leftID = l;
        int rightID = m+1;
        for(int k = l; k<=r; k++){
            if(leftID>m || (rightID<=r && input[rightID]<input[leftID])){
                temp[k] = input[rightID];
                rightID++;
            } else {
                temp[k] = input[leftID];
                leftID++;
            }
        }
        for(int k = l; k<=r; k++){
            input[k] = temp[k];
        }
        return input;
    }
}

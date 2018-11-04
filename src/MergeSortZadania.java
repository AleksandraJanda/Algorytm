import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortZadania {
    public static List<Integer[]> zadanie1(Integer[] array){
        List<Integer[]> list = new ArrayList<>();
        Integer[] a1 = Arrays.copyOfRange(array,0,array.length/2);
        Integer[] a2 = Arrays.copyOfRange(array, array.length/2, array.length);
        list.add(a1);
        list.add(a2);

        return list;
    }
    public static Integer[] zadanie2(List<Integer[]> list){
        Integer[] a1 = list.get(0);
        Integer[] a2 = list.get(1);
        int length = a1.length+a2.length;
        Integer[] array = new Integer[length];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(j<a1.length) {
                    array[i] = a1[j];
                    i++;
                    array[i] = a2[j];
                    i++;
                }
            }
        }
        return array;
    }
    public static Integer[] zadanie3(List<Integer[]> list){
        Integer[] a1 = list.get(0);
        Integer[] a2 = list.get(1);
        int length = a1.length+a2.length;
        Integer[] array = new Integer[length];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(j<a1.length) {
                    array[i] = a1[j];
                    i++;
                }
                if(j<a2.length) {
                    array[i] = a2[j];
                    i++;
                }
            }
        }
        return array;
    }
    public static Integer[] zadanie4(Integer[] a1, Integer[] a2){
        SortingAlgorithm sortingAlgorithm = new SelectionSort();
        Integer[] r1 = sortingAlgorithm.sort(a1);
        System.out.println(Arrays.toString(r1));
        Integer[] r2 = sortingAlgorithm.sort(a2);
        System.out.println(Arrays.toString(r2));
        List<Integer[]> list = Arrays.asList(r1,r2);
        Integer[] array = zadanie3(list);
        return sortingAlgorithm.sort(array);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,4,5,6};
        Integer[] array2 = new Integer[]{1,2,3,4,5,6,7};
        List<Integer[]> list = zadanie1(array);
        for(Integer[] x: list) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("Merge array(same size):");
        Integer[] result = zadanie2(list);
        System.out.println(Arrays.toString(result));

        System.out.println("*********************");
        List<Integer[]> list2 = zadanie1(array2);
        for(Integer[] x: list2) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("Merge array(different size):");
        Integer[] result2 = zadanie3(list2);
        System.out.println(Arrays.toString(result2));

        System.out.println("*********************");
        Integer[] arrayToSort1 = new Integer[]{6,3,9,0};
        Integer[] arrayToSort2 = new Integer[]{1,4,8,2};
        System.out.println("Sorted arrays:");
        Integer[] result3 = zadanie4(arrayToSort1,arrayToSort2);
        System.out.println(Arrays.toString(result3));
        System.out.println("*********************");
        Integer[] result4 = zadanie4(result,result2);
        System.out.println(Arrays.toString(result4));

        System.out.println("*********************");
        SortingAlgorithm sortingAlgorithm = new MergeSort();
        System.out.println("Merge sort:");
        Integer[] result5 = sortingAlgorithm.sort(arrayToSort1);
        System.out.println(Arrays.toString(result5));
        Integer[] result6 = sortingAlgorithm.sort(result);
        System.out.println(Arrays.toString(result6));


    }
}

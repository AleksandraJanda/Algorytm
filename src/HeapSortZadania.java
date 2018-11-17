import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class HeapSortZadania {
    public static int getLeftSonNumber(int k){
        return 2*k+1;
    }
    public static int getRightSonNumber(int k){
        return 2*k+2;
    }
    public static int getParentNumber(int k){
        return (k-1)/2;
    }
    public static boolean leftSonExists(int[] array, int k){
        return getLeftSonNumber(k)<array.length;
    }
    public static boolean rightSonExists(int[] array, int k){
        return getRightSonNumber(k)<array.length;
    }
    public static boolean isLeaf(int[] array, int k){
        return getRightSonNumber(k)>array.length;
    }
    public static void zadanie1(int[] array, int k){
        System.out.println("Chosen id: "+k+", value "+array[k]);
        System.out.println("Parent id: "+ getParentNumber(k)+", value: "+array[getParentNumber(k)]);
        if(leftSonExists(array,k)) {
            System.out.println("Left son id: " + getLeftSonNumber(k) + ", value: " + array[getLeftSonNumber(k)]);
        }
        if(rightSonExists(array,k)) {
            System.out.println("Right son id: " + getRightSonNumber(k) + ", value: " + array[getRightSonNumber(k)]);
        }
        System.out.println("Is leaf: "+isLeaf(array,k));
    }
    public static void zadanie2(int[] array, int k){
        System.out.println("Child: "+array[k]+", id "+k);
        System.out.println("Parent: "+array[getParentNumber(k)]+", id: "+getParentNumber(k));
        if(array[k]<array[getParentNumber(k)]){
            System.out.println("Parent greater than child");
        } else {
            System.out.println("Parent equals child");
        }
    }
    public static void parentChildSwap(int[] array, int k, Child child){
        int tmp = array[k];
        switch (child){
            case RIGHT:
                if(rightSonExists(array,k)) {
                    array[k] = array[getRightSonNumber(k)];
                    array[getRightSonNumber(k)] = tmp;
                    System.out.println("Swap with son: " + Child.RIGHT.toString());
                } else {
                    System.out.println("Right son does not exist");
                }
                break;
            case LEFT:
                if(leftSonExists(array,k)) {
                    array[k] = array[getLeftSonNumber(k)];
                    array[getLeftSonNumber(k)] = tmp;
                    System.out.println("Swap with son: " + Child.LEFT.toString());
                } else {
                    System.out.println("Left son does not exist");
                }
                break;
        }
    }
    public static void zadanie3(int[] array, int k, Child child){
        parentChildSwap(array,k,child);
        zadanie1(array,k);
    }
    public static int[] buildHeap(int[] input){
        for(int i = 0; i<input.length; i++){
            int currentNodeID = i;
            int parentID = getParentNumber(currentNodeID);
            int insertedValue = input[i];
            while(parentID>=0&&input[parentID]<insertedValue){
                currentNodeID = parentID;
                parentID = getParentNumber(currentNodeID);
            }
            input[currentNodeID] = insertedValue;
        }
        return input;
    }
    public static void heapZadanie3(int[] array, int k){
        while(!isLeaf(array, k)){
            //int id = k;
            System.out.println(getLeftSonNumber(k));
            System.out.println(getRightSonNumber(k));
            k = 2*k+1;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{8,7,6,6,4,6,5,2,1,4,3,6,2,4};
        int[] array2 = new int[]{5,6,4,2,1,9,7};

        int k = 3;
        //zadanie1(array,k);
        //zadanie2(array,k);
        //zadanie3(array,k,Child.LEFT);
        int[] heap = buildHeap(array);
        System.out.println("BuildHeap: "+ Arrays.toString(heap));
        //zadanie1(heap,3);
        //System.out.println("BuildHeap: "+ Arrays.toString(buildHeap(array2)));

    }
}

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
        for(int i = 1; i<input.length; i++){
            int currentNodeID = i;
            int parentID = getParentNumber(currentNodeID);
            int insertedValue = input[i];
            while(parentID>=0&&input[parentID]<insertedValue){
                input[currentNodeID] = input[parentID];
                currentNodeID = parentID;
                parentID = getParentNumber(currentNodeID);
            }
            input[currentNodeID] = insertedValue;
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
    public static int[] shiftHeap(int[] input){
        for(int i = input.length-1; i>=1; i--){
            int tmp = input[0];
            input[0] = input[i];
            input[i]=tmp;
            int parentID = 0;
            int leftChildID = 1;
            while(leftChildID<i){
                int greaterChildID = leftChildID;
                int rightChildID = leftChildID+1;
                if (rightChildID < i && input[rightChildID] > input[leftChildID]){
                    greaterChildID = rightChildID;
                }
                if(input[greaterChildID]<=input[parentID]){
                    break;
                }
                tmp = input[parentID];
                input[parentID] = input[greaterChildID];
                input[greaterChildID] = tmp;
                parentID = greaterChildID;
                leftChildID = getLeftSonNumber(parentID);
            }
        }
        return input;
    }
    public static int[] buildAndShift(int[] input){
        
        return input;
    }

    public static void wLeft(int[] array, int k){
        System.out.println(array[getLeftSonNumber(k)]);
    }
    public static void wRight(int[] array, int k){
        System.out.println(array[getRightSonNumber(k)]);
    }
    public static void heapZadanie3(int[] array, int k){

    }

    public static void main(String[] args) {
        int[] array = new int[]{8,7,6,6,4,6,5,2,1,4,3,6,2,4};
        int[] array2 = new int[]{5,9,12,4,13,81,65}; //81,12,65,4,5,9,13
        int k = 1;
        //zadanie1(array,k);
        //zadanie2(array,k);
        //zadanie3(array,k,Child.LEFT);
        //System.out.println("BuildHeap: "+ Arrays.toString(heap));
        //zadanie1(heap,3);
        //System.out.println("To build:\t"+ Arrays.toString(array2));
        //System.out.println("BuildHeap:\t"+ Arrays.toString(buildHeap(array2)));
        //heapZadanie3(array,k);
        System.out.println("ShiftHeap:\t"+ Arrays.toString(shiftHeap(array)));
        //System.out.println("ShiftHeap:\t"+ Arrays.toString(shiftHeap(buildHeap(array2))));
    }
}

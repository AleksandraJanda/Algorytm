public class MainBubbleSort {
    public static void zadanie1(int[] array){
        int length = array.length;
        for(int i :array){
            for(int j = 0; j<length; j++){
                System.out.print(j+":"+array[j]+"\t");
            }
            System.out.println();
            length--;
        }
    }
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3,6,7,0};
        SortingAlgorithm sortingAlgorithm = new BubbleSort();
        Integer[] result = sortingAlgorithm.sort(array);
        for(Integer x: result){
            System.out.print(x+"\t");
        }
        System.out.println();
        int[] array2 = new int[]{1,2,3,4};
        zadanie1(array2);
    }
}

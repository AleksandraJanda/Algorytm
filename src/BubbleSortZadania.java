public class BubbleSortZadania {
    public static int[] zadanie1(int[] array, int e1, int e2){
        int temp = array[e1];
        array[e1]=array[e2];
        array[e2]=temp;
        return array;
    }
    public static void zadanie2(int[] array){
        for(int x:array){
            System.out.print(x+"\t");
        }
        //System.out.println();
    }
    public static void zadanie3(int[] array){
        int i = 0;
        while(i<array.length){
            zadanie2(array);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,24,36,42};
        int e1 = 0;
        int e2 = 3;
        int[] array2 = zadanie1(array,e1,e2);
        zadanie2(array2);
        System.out.println();
        zadanie3(array2);
    }
}

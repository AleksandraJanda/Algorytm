public class BubbleSortZadania {
    public static void zadanie1(int[] array, int e1, int e2){
        int temp = array[e1];
        array[e1]=array[e2];
        array[e2]=temp;
    }
    public static void zadanie2(int[] array){
        for(int x=0; x<array.length;x++){
            System.out.print(x+":"+array[x]+"\t");
        }
    }
    public static void zadanie3(int[] array){
        int i = 0;
        while(i<array.length){
            zadanie2(array);
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void zadanie4(int[] array){
        for(int i=0;i<array.length;i++){
            if(i-1>=0) {
                zadanie1(array, i-1, i);
            }
            zadanie2(array);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40};
        int e1 = 0;
        int e2 = 3;
        //int[] array2 = zadanie1(array,e1,e2);
        //zadanie2(array2);
        //System.out.println();
        zadanie3(array);
        //System.out.println();
        zadanie4(array);
    }
}

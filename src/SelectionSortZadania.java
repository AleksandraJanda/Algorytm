public class SelectionSortZadania {
    public static void zadanie1(int[] array){
        int min = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Min: "+min);
    }
    public static void zadanie2(int[] array, int a, int b){
        int min = array[a];
        for(int i = a+1; i<=b; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Min: "+min);
    }
    public static void selectionSorting(int[] array){
        for(int i = 0; i<=array.length-2; i++){
            int min = i;
            for(int j = i+1; j<array.length; j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        for(int x: array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,7,2,9,4,6};
        int a = 3;
        int b = 5;
        zadanie1(array);
        zadanie2(array,a,b);
        selectionSorting(array);
    }
}

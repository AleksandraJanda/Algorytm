import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortZadania {
    public static int zadanie1(int[] array){
        int id = array.length/2;
        return array[id];
    }
    public static int zadanie2(int[] array){
        Random random = new Random();
        int id = random.nextInt(array.length);
        return array[id];
    }
    public static List<Integer> zadanie3(int[] array, int element){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<array.length; i++){
            if(array[i]<element){
                list.add(array[i]);
            }
        }
        return list;
    }
    public static List<Integer> zadanie4(int[] array, int element){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<array.length; i++){
            if(array[i]>element){
                list.add(array[i]);
            }
        }
        return list;
    }
    public static List<Integer> zadanie5(int[] array){
        int countElement = 0;
        int element = zadanie1(array);
        for(int i = 0; i<array.length; i++){
            if(array[i]==element){
                countElement++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Integer x: zadanie3(array,element)){
            list.add(x);
        }
        for(int i = 0; i<countElement; i++){
            list.add(element);
        }
        for(Integer x: zadanie4(array,element)){
            list.add(x);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9,5,1,3,7,4,6};
        System.out.println("Pobrany element: "+zadanie1(array));
        int element = zadanie2(array);
        System.out.println("Pobrany element: "+element);
        System.out.println();
        System.out.println("Elementy mniejsze: "+zadanie3(array,element).toString());
        System.out.println("Elementy większe: "+zadanie4(array,element).toString());
        int[] array2 = new int[]{2,9,5,5,4,7,6};
        System.out.println();
        System.out.println("Sortowanie: "+zadanie5(array2).toString());
    }
}

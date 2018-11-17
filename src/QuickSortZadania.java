import java.util.*;
import java.util.stream.Collectors;

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
    public static List<Integer> zadanie3456(int[] array){
        List<Integer> list = new ArrayList<>();
        int countElement = 0;
        int element = zadanie1(array);
        for(int i:array){
            if(i==element){
                countElement++;
            }
        }
        for(int i:array){
            if(i<element){
                list.add(i);
            }
        }
        for(int i = 0; i<countElement; i++){
            list.add(element);
        }
        for(int i:array){
            if(i>element){
                list.add(i);
            }
        }
        return list;
    }
    public static List<Integer> zadanie345(int[] array){
        List<Integer> result = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();

        int element = zadanie1(array);
        for(int i:array){
            if(i==element){
                middle.add(element);
            }
        }
        for(int i:array){
            if(i<element){
                min.add(i);
            } else if(i>element){
                max.add(i);
            }
        }
        min = min.stream()
                .sorted()
                .collect(Collectors.toList());
        max = max.stream()
                .sorted()
                .collect(Collectors.toList());
        result.addAll(min);
        result.addAll(middle);
        result.addAll(max);
        return result;
    }
    public static int[] zadanie34567(int[] array){
        int element = zadanie1(array);
        for(int i=0; i<array.length; i++){
            if(array[i]==element){
                int temp = array[array.length-1];
                array[array.length-1] = array[i];
                array[i] = temp;
            }
        }
        int j = 0;
        int temp2 = 0;
        for(int i = 0; i<array.length-1; i++){
            if(array[i]<element){
                temp2 = array[i];
                array[i]=array[j];
                array[j]=temp2;
                j++;
            }

        }
        temp2 = array[j];
        array[j]=array[array.length-1];
        array[array.length-1]=temp2;

        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{9,5,1,3,7,4,6};
        System.out.println("Pobrany element: "+zadanie1(array));
        int element = zadanie2(array);
        System.out.println("Pobrany element: "+element);
        System.out.println();
        System.out.println("Elementy mniejsze: "+zadanie3(array,element).toString());
        System.out.println("Elementy większe: "+zadanie4(array,element).toString());
        int[] array2 = new int[]{2,9,8,5,4,7,6};
        System.out.println();
        System.out.println("Sortowanie: "+zadanie5(array2).toString());
        System.out.println("Sortowanie: "+zadanie345(array2).toString());
        System.out.println("Sortowanie: "+ Arrays.toString(zadanie34567(array2)));


    }
}

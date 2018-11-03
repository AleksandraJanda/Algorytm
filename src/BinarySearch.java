import java.util.List;

public class BinarySearch implements SearchAlgorithm{
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }
    @Override
    public Integer search(Integer value, Integer[] input) {
        int id;
        if(input.length%2==0){
            id = input.length/2-1;
        } else {
            id = input.length/2;
        }
        return id;
    }
    public static int zadanie1(int[] tab){
        int id;
        if(tab.length%2==0){
            id = tab.length/2-1;
        }else{
            id = tab.length/2;
        }
        return id;
    }
    public static void zadanie2(int[] tab, int a){
        for(int i=0; i<=a; i++){
            System.out.print(tab[i]+"\t");
        }
    }
    public static void zadanie3(int[] tab, int b){
        for(int i=b; i<tab.length; i++){
            System.out.print(tab[i]+"\t");
        }
    }
    public static void zadanie4(int[] tab, int a, int b){
        for(int i=a; i<=b; i++){
            System.out.print(tab[i]+"\t");
        }
    }
    public static void fibonacci(int n){
        int[] tab = new int[n];
        tab[0]=0;
        tab[1]=1;
        for(int i = 2; i<n; i++){
            tab[i]=tab[i-1]+tab[i-2];
        }
        for(int x: tab){
            System.out.print(x+"\t");
        }
    }
    public int fibonacciRek (int n){
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fibonacciRek(n-1)+fibonacciRek(n-2);
        }
    }

    public static void main(String[] args) {
        int[] tab = new int[]{0,1,2,3,4,5,6};
        Integer[] tab2 = new Integer[]{1,2,3,4,5,6,7};
        System.out.println(zadanie1(tab));
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.search(0,tab2);
        System.out.println(index);
        System.out.println();
        int a = 2;
        int b = 4;
        zadanie2(tab,a);
        System.out.println();
        zadanie3(tab,b);
        System.out.println();
        zadanie4(tab,a,b);
        System.out.println();
        fibonacci(10);
        System.out.println();
        BinarySearch fibonacci = new BinarySearch();
        for(int i=0;i<10;i++){
            System.out.print(fibonacci.fibonacciRek(i)+"\t");
        }
    }
}

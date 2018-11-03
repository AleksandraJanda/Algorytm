public class BinarySearch {
    public static int zadanie1(int[] tab){
        int id=-1;
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

    public static void main(String[] args) {
        int[] tab = new int[]{0,1,2,3,4,5,6};
        //System.out.println(zadanie1(tab));
        int a = 2;
        int b = 4;
        zadanie2(tab,a);
        System.out.println();
        zadanie3(tab,b);
        System.out.println();
        zadanie4(tab,a,b);
    }
}

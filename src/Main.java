public class Main {
    public static void main(String[] args) {
        Integer[] input = new Integer[]{5,6,7,8,9,1,2,9,4,9};
        SearchAlgorithm searchAlgorithm = new LinearSearch();
        int result = searchAlgorithm.search(3,input);
        System.out.println(result);
    }
}

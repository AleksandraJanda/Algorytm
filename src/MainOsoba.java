import java.util.LinkedList;
import java.util.List;

public class MainOsoba {
    public static void main(String[] args) {
        //list.add(new Osoba("Lucjan", "Dół", 35));
        //list.add(new Osoba("Jan", "Nowak", 40));

        OsobaGen[] o = new OsobaGen[]{new OsobaGen("Tomasz", "Pomarańcza", 25),
                new OsobaGen("Anna", "Kowalska", 30),
                new OsobaGen("Katarzyna", "Kowalska", 35)};
        int value = 30;

        SearchAlgorithm<OsobaGen> binarySearch = new BinarySearchRec<>();

        int result = binarySearch.search(new OsobaGen("Anna", "Kowalska", 30), o);
        System.out.println("Result: "+result);

        LinearSearch<OsobaGen> linearSearch = new LinearSearch<>();
        OsobaGen[] oo = new OsobaGen[]{new OsobaGen("Tomasz", "Pomarańcza", 25),
                new OsobaGen("Anna", "Kowalska", 30),
                new OsobaGen("Ola", "Kowalska", 30),
                new OsobaGen("Katarzyna", "Kowalska", 35)};
        int valuee = 30;
        List<Integer> results = linearSearch.searchAll(new OsobaGen("Anna", "Kowalska", 30),oo);
        System.out.println("Results: "+results);

    }
}

import java.util.List;

public class Osoba{
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public Osoba(){}
    public Osoba(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Integer searchOsoba (Integer value, List<Osoba> input){
        int low = 0;
        int high = input.size()-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(input.get(mid).getAge()>value){
                high = mid - 1;
            } else if (input.get(mid).getAge()< value){
                low = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

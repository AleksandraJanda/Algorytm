import java.util.List;
import java.util.Objects;

public class OsobaGen implements Comparable<OsobaGen>{
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public OsobaGen() {
    }

    public OsobaGen(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(OsobaGen o) {
        if(this.age>o.getAge()){
            return 1;
        } else if (this.getAge()<o.getAge()){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OsobaGen) {
            return this.age == ((OsobaGen) obj).getAge();

        }
        return super.equals(obj);
    }
}
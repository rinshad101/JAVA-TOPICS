import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("rinshad");
        name.add("aginas");
        name.add("amir");
        name.add("minhaj");

        System.out.println(name);

        name.remove(1);

        System.out.println(name);

        System.out.println(name.get(1));
    }
}
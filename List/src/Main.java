import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList in java
        List<String> name = new ArrayList<>();
        
        name.add("rinshad");
        name.add("aginas");
        name.add("amir");
        name.add("minhaj");

        System.out.println(name);

        name.remove(1);
        System.out.println(name);
        System.out.println(name.get(1));

        // LinkedList in java
        List<Integer> newlist = new LinkedList<>();
        newlist.add(12);
        newlist.add(14);
        newlist.add(15);

        System.out.println(newlist);
        newlist.add(1,23);

        System.out.println(newlist);
        newlist.remove(2);
        System.out.println(newlist);
        System.out.println(newlist.get(0));
    }
}
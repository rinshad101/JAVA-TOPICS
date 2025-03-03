import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // HashSet
        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Canada");
        countries.add("India");  // Duplicate - won't be added

        System.out.println("HashSet: " + countries); // Order is not guaranteed


        // LinkedHashSet
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(10); // Duplicate - ignored

        System.out.println("LinkedHashSet: " + numbers); // Output: [30, 10, 50]


        // TreeSet
        Set<String> names = new TreeSet<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        System.out.println("TreeSet: " + names); // Output: [Alice, Bob, Charlie] (Sorted order)
    }
}
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // HashMap
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("HashMap: " + students);


        //LinkedHashMap
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 90);

        System.out.println("LinkedHashMap: " + scores); // Maintains insertion order


        //TreeMap
        Map<Integer, String> students1 = new TreeMap<>();
        students1.put(103, "Charlie");
        students1.put(101, "Alice");
        students1.put(102, "Bob");

        System.out.println("TreeMap: " + students1); // Keys will be sorted
    }
}
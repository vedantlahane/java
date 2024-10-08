
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Retrieve a value
        System.out.println("Apple: " + map.get("Apple")); // Output: Apple: 1

        // Check if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map.");
        }

        // Iterate over the entries
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


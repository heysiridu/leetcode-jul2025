// reviews of HashSet compared with HashMap
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // Create a HashSet to store unique elements
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // Duplicate, will not be added
        set.remove("apple"); // Remove an element

        Set<Character> charSet = new HashSet<>();

        // Add characters to the character set
        charSet.add('a');
        charSet.add('b');
        charSet.add('c');
        charSet.add('a'); // Duplicate, will not be added

        // Display the character set
        System.out.println(charSet);
        // Display the elements in the set
        System.out.println(set);

        
    }
}

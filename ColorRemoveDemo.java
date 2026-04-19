package ArrayList;
import java.util.*;

public class ColorRemoveDemo {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding colors
        ls.add("Orange");
        ls.add("green");   // fixed typo
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Display original list
        System.out.println("Original List: " + ls);

        // Removing 2nd element (index 1)
        ls.remove(1);
        System.out.println("After removing 2nd element: " + ls);

        // Removing "Blue"
        ls.remove("Blue");
        System.out.println("After removing Blue: " + ls);
    }
}
//3. Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
package ArrayList;
import java.util.*;

public class ColorSortDemo {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding colors
        ls.add("Orange");
        ls.add("green");   // fixed typo
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sorting the list
        Collections.sort(ls);

        // After sorting
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}

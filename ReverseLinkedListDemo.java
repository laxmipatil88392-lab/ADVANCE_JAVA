//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
package LinkedList;
import java.util.*;
public class ReverseLinkedListDemo {
	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> ls = new LinkedList<>();

	        // Add elements
	        ls.add("Orange");
	        ls.add("Green");
	        ls.add("Pink");
	        ls.add("Red");
	        ls.add("Blue");

	        // Reverse iteration using descendingIterator()
	        Iterator<String> iterator = ls.descendingIterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}



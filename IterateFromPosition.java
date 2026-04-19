package LinkedList;
import java.util.*;
public class IterateFromPosition {
	    public static void main(String[] args) {

	        List<String> ls = new LinkedList<>();

	        ls.add("Orange");
	        ls.add("green");
	        ls.add("pink");
	        ls.add("red");
	        ls.add("Blue");

	        Iterator<String> iterator = ls.listIterator(2);

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


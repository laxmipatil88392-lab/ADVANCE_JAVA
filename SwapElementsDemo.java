package LinkedList;
import java.util.*;
public class SwapElementsDemo {
	    public static void main(String[] args) {
	        LinkedList<String> ls = new LinkedList<>();
	        ls.add("Orange");
	        ls.add("geen");
	        ls.add("pink");
	        ls.add("red");
	        ls.add("Blue");

	        System.out.println("Before swapping");
	        System.out.println(ls);

	        Collections.swap(ls, 0, 2);

	        System.out.println("After swapping");
	        System.out.println(ls);
	    }
	}

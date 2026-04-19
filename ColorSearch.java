package ArrayList;
import java.util.*; 
public class ColorSearch {
	 public static void main(String[] args) {

	        List<String> ls = new ArrayList<>();

	        ls.add("Orange");
	        ls.add("green");
	        ls.add("pink");
	        ls.add("red");

	        System.out.println(ls);

	        if (ls.contains("red")) {
	            System.out.println("Red is available in the list");
	        } else {
	            System.out.println("Red is not available in the list");
	        }
	    }

}

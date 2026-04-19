//pack3a. Develop a java program for performing various string operations with different string handling
//functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()age stringfunction;
import java.util.*;

public class StringHandlingDemo {
	
		public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        System.out.println("=== String Creation and Basic Operations ===");
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\n=== Length and Character Access ===");
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("\n=== String Comparison ===");
	        String s1 = "Java";
	        String s2 = "java";
	        System.out.println("s1 equals s2: " + s1.equals(s2));
	        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
	        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

	        // 4. String Searching
	        System.out.println("\n=== String Searching ===");
	        String searchStr = "Java Programming";
	        System.out.println("Index of 'Pro': " + searchStr.indexOf("Pro"));
	        System.out.println("Last index of 'a': " + searchStr.lastIndexOf('a'));
	        System.out.println("Contains 'Java': " + searchStr.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\n=== Substring Operations ===");
	        System.out.println("Substring (0,4): " + searchStr.substring(0, 4));
	        System.out.println("Substring from index 5: " + searchStr.substring(5));

	        // 6. String Modification
	        System.out.println("\n=== String Modification ===");
	        String modStr = "Java Programming";
	        System.out.println("Replace 'Java' with 'Python': " + modStr.replace("Java", "Python"));
	        System.out.println("Uppercase: " + modStr.toUpperCase());
	        System.out.println("Lowercase: " + modStr.toLowerCase());

	        // 7. Whitespace Handling
	        System.out.println("\n=== Whitespace Handling ===");
	        String ws = "   Hello Java   ";
	        System.out.println("Before trim: '" + ws + "'");
	        System.out.println("After trim: '" + ws.trim() + "'");

	        // 8. String Concatenation
	        System.out.println("\n=== String Concatenation ===");
	        String concat = str1 + " " + str2;
	        System.out.println("Using + : " + concat);
	        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

	        // 9. String Splitting
	        System.out.println("\n=== String Splitting ===");
	        String fruits = "Apple,Banana,Mango";
	        String[] arr = fruits.split(",");
	        for (String f : arr) {
	            System.out.println(f);
	        }

	        // 10. StringBuilder Demo
	        System.out.println("\n=== StringBuilder Demo ===");
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(0, 5, "Hi");
	        sb.delete(2, 3);
	        System.out.println("StringBuilder Result: " + sb);

	        // 11. String Formatting
	        System.out.println("\n=== String Formatting ===");
	        String name = "Rahul";   // Changed name here
	        int marks = 85;
	        String formatted = String.format("Name: %s, Marks: %d", name, marks);
	        System.out.println(formatted);

	        // 12. Email Validation using contains(), startsWith(), endsWith()
	        System.out.println("\n=== Email Validation ===");
	        String email = "example@gmail.com";

	        if (email.contains("@") &&
	            email.startsWith("example") &&
	            email.endsWith(".com")) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
		}
}
	





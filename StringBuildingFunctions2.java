//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
package stringfunction;

public class StringBuildingFunctions2 {
		// 2. Function to count occurrences of a substring
		public static int countOccurrences(String mainString, String subString) {
		if (mainString == null || subString == null || subString.isEmpty()) {
		return 0;
		}
		return (mainString.length() - mainString.replace(subString, "").length()) /
		subString.length();
		}

		public static void main(String[] args) {
		System.out.println("2. Occurrences: " + countOccurrences("hello hello world", "hello"));
		}
		}


package stringfunction;

public class StringBuildingFunctions10 {
		// 10. Function to count words in a string
		public static int countWords(String str) {
		if (str == null || str.trim().isEmpty()) {
		return 0;
		}
		return str.trim().split("\\s+").length;
		}

		public static void main(String[] args) {
		System.out.println("10. Word Count: " + countWords("Hello world java"));
		}
		}


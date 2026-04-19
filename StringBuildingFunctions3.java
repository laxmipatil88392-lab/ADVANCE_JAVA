package stringfunction;

public class StringBuildingFunctions3 {
		// 3. Function to reverse a string
		public static String reverseString(String str) {
		if (str == null) {
		return null;
		}
		return new StringBuilder(str).reverse().toString();
		}

		public static void main(String[] args) {
		System.out.println("3. Reverse: " + reverseString("hello"));
		}
		}


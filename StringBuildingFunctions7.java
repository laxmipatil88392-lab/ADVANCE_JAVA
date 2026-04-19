package stringfunction;

public class StringBuildingFunctions7 {
		// 7. Function to truncate a string to a specified length
		public static String truncate(String str, int maxLength) {
		if (str == null) {
		return null;
		}
		return str.length() > maxLength ? str.substring(0, maxLength) + "..." : str;
		}

		public static void main(String[] args) {
		System.out.println("7. Truncate: " + truncate("Hello World", 5));
		}
		}


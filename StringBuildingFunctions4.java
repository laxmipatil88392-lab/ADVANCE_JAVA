//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():
package stringfunction;

public class StringBuildingFunctions4 {
		// 4. Function to check if a string is a palindrome
		public static boolean isPalindrome(String str) {
		if (str == null) {
		return false;
		}
		String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
		}

		public static void main(String[] args) {
		System.out.println("4. Palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
		}
		}



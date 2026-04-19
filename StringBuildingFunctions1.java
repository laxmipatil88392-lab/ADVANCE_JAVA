package stringfunction;

public class StringBuildingFunctions1 {

		// 1. Function to check if a string is empty or null
		public static boolean isNullOrEmpty(String str) {
		return str == null || str.trim().isEmpty();
		}

		public static void main(String[] args) {
		System.out.println("1. Is Empty: " + isNullOrEmpty(""));
		}
		}



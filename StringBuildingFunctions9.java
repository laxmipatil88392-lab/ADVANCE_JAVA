package stringfunction;

public class StringBuildingFunctions9 {
		// 9. Function to generate a random string of specified length
		public static String generateRandomString(int length) {
		String characters =
		"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder random = new StringBuilder();
		for (int i = 0; i < length; i++) {
		int index = (int) (Math.random() * characters.length());
		random.append(characters.charAt(index));
		}
		return random.toString();
		}

		public static void main(String[] args) {
		System.out.println("9. Random String: " + generateRandomString(10));
		}
		}


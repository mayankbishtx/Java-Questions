public class ReverseString {

	static String reverseString(String word) {
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		return reversed;
	}

	public static void main(String[] args) {
		String word = "zyxwvutsrqponmlkjihgfedcba";

		System.out.println("Original String: " + word);
		String reversed = reverseString(word);
		System.out.println("Reversed String: " + reversed);
	}
}

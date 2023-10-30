package string;

public class Assignment1 {

	public static void main(String[] args) {
		// Write a program which creates a String “Welcome to Java World” and performs
		// the following
		String s1 = "Welcome to Java World";
		// Returns the character at 5th position and display it.
		char ch = s1.charAt(4);
		System.out.println("Character at 5th position: " + ch);
		// Compares the above String with “Welcome” lexicographically ignoring case
		// differences and display the result.
		boolean Equal = s1.equalsIgnoreCase("Welcome");
		System.out.println("Compare with welcome:" + Equal);
		// Concatenates “- Let us learn” to the above string and display it.
		s1 = s1 + " - Let us learn";
		System.out.println("Concatenated String: " + s1);
		// Returns the position of the first occurrence of character ‘a’ and display it.
		int index = s1.indexOf('a');
		System.out.println("index of 'a': " + index);
		// Replaces all the occurrences of ‘a’ character with the new ‘e’ and display
		// it.
		s1 = s1.replace('a', 'e');
		System.out.println("Replaced a with e : " + s1);
		// Returns string between 4th position and 10th position and display it.
		s1 = s1.substring(3, 10);
		System.out.println("Substring between 4th and 10th position: " + s1);
		// Returns the lowerCase of the string and display it.
		s1 = s1.toLowerCase();
		System.out.println("Lowercase String: " + s1);

	}

}

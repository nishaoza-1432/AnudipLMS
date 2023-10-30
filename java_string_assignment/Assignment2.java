package string;

public class Assignment2 {

	public static void main(String[] args) {
		// Write a program which creates a StringBuffer “This is StringBuffer” and
		// performs the following.
		StringBuffer sb = new StringBuffer("This is StringBuffer");
		// Adds the string”- This is a sample program” to existing string and display
		// it.
		sb.append("- This is a sample program");
		System.out.println("After appending: " + sb);
		// Inserts the string “Object” into the existing string at 21st position and
		// display it.
		sb.insert(20, "Object");
		System.out.println("After inserting 'Object': " + sb);
		// Reverses the entire string and displays it.
		sb.reverse();
		System.out.println("Reversed String: " + sb);
		sb.reverse();
		System.out.println("original String: " + sb);
		// Replaces the word “Buffer” with “Builder” and display it.
		sb.replace(14, 20, "Builder");
		System.out.println("Replaced String: " + sb);
	}

}

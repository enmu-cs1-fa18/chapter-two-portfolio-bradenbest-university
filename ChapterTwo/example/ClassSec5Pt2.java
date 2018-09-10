

public class ClassSec5Pt2 {

	public static void main(String[] args) {
		// Strings, Characters, and Substrings
		/*
		 * Character: 
		 * String:
		 * charAt(<position>): 
		 */
		
		final int position = 1;
		String name = "Jessie";
		char start = name.charAt(position);
		int strLength = name.length();
		System.out.printf("The string is %s.\n", name);
		System.out.printf("The character in position %d is %s", position, start);
		System.out.printf(". The string length is %d.\n", strLength);
		/*
		 * Strings start at position:
		 * The position of the last character in the string is:
		 * The reason is:
		 */
		/*
		 * Substrings
		 * str.substring(start, pastEnd - 1); // goes from start to pastEnd-1
		 * str.substring(begin); // goes from "begin" to end of str
		 * 
		 * Other string processing options can be found by googling "java oracle string documentation"
		 * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		 * scroll down to methods
		 */
		/*
		 * Create code to input first, middle, and last name. Code outputs initials.
		 */
		

	}

}

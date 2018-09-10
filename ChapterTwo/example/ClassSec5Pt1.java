

public class ClassSec5Pt1 {

	public static void main(String[] args) {
		// Strings
		/*
		 * String: 
		 *   
		 *   length of a string:
		 *      int nameLength = name.length();
		 *
		 *   literal vs. variable: 
		 *   
		 * String type:
		 * Empty string:
		 */
		string name = "Harry";
		int nameLength = name.length();
		System.out.println("Length of string: " + name + " is " + nameLength + " characters.");
		/*
		 * Concatenation:
		 */
		String fName = "";
		String lName = "";
		String fullName = fName + lName;
		int rank = 7;
		String agent = lName + rank; // this statement automatically casts rank as a string
		/*
		 * String input:
		 */
		System.out.print("Please enter your name: "); // prompt for name
		String fName = in.next(); // this reads input until a space or an enter is found.
		/*How can we get first and last name into fName and lName without having to make 
		 * two prompts?
		 * 
		 * Escape sequences: /n and /t
		 *  the /n stands for:
		 *  the /t stands for:
		 *  We can use these escape sequences in printf formats too!
		 */
		printf("The name entered was $s %s ./n", fName, lName);
		 /* 
		 * Assignment:
		 * 	  The user inputs two adjectives, three nouns, a number, a verb, and a body part. 
		 *    The program outputs this story with the nouns and adjectives inserted into the 
		 *    appropriate places in the song below (it's a MadLib). Make sure the printed lines are 
		 *    all about the same length. Be sure to follow all the standards of good coding.
		 *    Keep your inputs respectable on the version you copy/paste to submit to me!
		 *    
		 *    Hey baby, I guarantee there'll be Adj1 times. I guarantee that at some
		 *    Noun1, Number1 or both of us is gonna want to get out of this Noun2. But
		 *    I also guarantee that if I don't ask you to be Adj2, I'll Verb1 it for the
		 *    rest of my Noun3, because I know in my Bodypart1, you're the only one for me.
		 *    
		 *    Be sure to double check the spacing on your output!
		 */
	}

}

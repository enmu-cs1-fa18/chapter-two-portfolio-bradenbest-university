
/**
 * Extracts a particular string from a longer one.
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 *
 */
public class StringExtractor {
	 /* 
	 * Assignment:
	 * 1. Using any of the string methods, write a sequence of commands that will extract 
	 *    characters from final String inputString = "The quick brown fox jumps over the lazy dog." to make
	 *    outputString = "Tempus fugit.". Then print inputString and outputString. Be sure to add some 
	 *    text so we know what has been done! 
	 *    
	 *    Correct any style, runtime, or compiler errors in the starter code.
	 */
	final static String inputString = "The quick brown fox jumps over the lazy dog.";
	//                                 ^ ^^ ^^         ^     ^^^      ^          ^
	//                                 01234567890123456789012345678901234567890123
	//                                 0         1         2         3         4
	final static String outputString = "Tempus fugit";
	
	public static void main(String[] args) {
		String out = "";
		int[] sequence = {0, 2, 22, 23, 5, 24, 3, 16, 5, 42, 6, 31};
		
		for(int i : sequence)
			out += inputString.substring(i, i + 1);
		
		System.out.println(inputString);
		System.out.println("^ ^^ ^^         ^     ^^^      ^          ^");
		System.out.println(out);
	}
}

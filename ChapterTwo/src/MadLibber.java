
/**
 * Gets words from user to fill in the gaps in a story.
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 *
 */
public class MadLibber {
	/* 
	 * 	  Assignment:
	 * 	  The user inputs two adjectives, three nouns, a number, a verb, and a body part. 
	 *    The program outputs this story with the nouns and adjectives inserted into the 
	 *    appropriate places in the song below (it's a MadLib). Make sure the printed lines are 
	 *    all about the same length. Be sure to follow all the standards of good coding.
	 *    Keep your inputs respectable on the version you copy/paste to submit to me!
	 */
	
	/*	  MADLIB:
	 * 
	 *    Hey baby, I guarantee there'll be Adj1 times. I guarantee that at some
	 *    Noun1, Number1 or both of us is gonna want to get out of this Noun2. But
	 *    I also guarantee that if I don't ask you to be Adj2, I'll Verb1 it for the
	 *    rest of my Noun3, because I know in my Bodypart1, you're the only one for me.
	 *    
	 *    Be sure to double check the spacing on your output!
	 */
	public static void main(String[] args) {
		String[] adjectives = {"moist", "salty"};
		String[] nouns = {"goose", "cult", "Kool-aid"};
		String number = "a billion";
		String verb = "drink";
		String bodypart = "pancreas";
		
		madlib(adjectives, nouns, number, verb, bodypart);

	}
	
	private static void madlib(String[] adjectives, String[] nouns, String number, String verb, String bodypart){
		System.out.printf("Hey baby, I guarantee there'll be %s times. I guarantee that at some\n", adjectives[0]);
		System.out.printf("%s, %s or both of us is gonna want to get out of this %s. But\n", nouns[0], number, nouns[1]);
		System.out.printf("I also guarantee that if I don't ask you to be %s, I'll %s it for the\n", adjectives[1], verb);
		System.out.printf("rest of my %s, because I know in my %s, you're the only one for me.\n", nouns[2], bodypart);
	}

}

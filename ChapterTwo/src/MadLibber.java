import java.util.Scanner;

/**
 * Gets words from user to fill in the gaps in a story.
 * @author Braden Best
 * @version 0.2 (ahead of assignment by 1 commit)
 * @date 2018-09-16
 *
 * changelog:
 *   0.2
 *     + added user input, as I hadn't seen the detail about the *user* entering these things.
 *   0.1
 *     initial assignment. This is the version uploaded on canvas
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
    private static Scanner scanner;

	public static
    void
    main(String[] args)
    {
		String[] adjectives = new String[2];
        String[] nouns = new String[3];
		String number, verb, bodypart;
		
        scanner = new Scanner(System.in);

        System.out.println("[MadLibber] I'm gonna ask you to enter a few words...");
        adjectives[0] = get_string("[1/8] an adjective (1)");
        adjectives[1] = get_string("[2/8] an adjective (2)");
        nouns[0]      = get_string("[3/8] a noun (1)");
        nouns[1]      = get_string("[4/8] a noun (2)");
        nouns[2]      = get_string("[5/8] a noun (3)");
        number        = get_string("[6/8] a number");
        verb          = get_string("[7/8] a verb");
        bodypart      = get_string("[8/8] a bodypart");

        scanner.close();
		madlib(adjectives, nouns, number, verb, bodypart);

	}

    private static
    String
    get_string(String prompt)
    {
        System.out.print(prompt + " >");
        return scanner.next();
    }
	
	private static
    void
    madlib(String[] adjectives, String[] nouns, String number, String verb, String bodypart)
    {
		System.out.printf("Hey baby, I guarantee there'll be %s times. I guarantee that at some\n", adjectives[0]);
		System.out.printf("%s, %s or both of us is gonna want to get out of this %s. But\n", nouns[0], number, nouns[1]);
		System.out.printf("I also guarantee that if I don't ask you to be %s, I'll %s it for the\n", adjectives[1], verb);
		System.out.printf("rest of my %s, because I know in my %s, you're the only one for me.\n", nouns[2], bodypart);
	}

}

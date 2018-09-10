

public class DistanceConverter {
	/* Assignment:
	 * You want to know how many feet are in 3.5 yards, and how many inches are in 
	 * 3.5 yards. You write the following program for that purpose:
	 */
	
	public static void main (String[] args) {
		double yards = 3.5;
		double feet = yards * 3;
		double inches = feet * 12;
		//TODO Rewrite Code.
		System.out.println(yards + "yards are" + feet + "feet");
		System.out.println(yards + "yards are" + inches + "inches");
	}
}

/*   a. The problem with the code above is that using "magic numbers" makes the program 
 *      hard to debug and maintain. Modify the program so that it uses constants to improve
 *      legibility and makes it easier to maintain.
 *   b. Add chunking and comments to enhance the readability. Don't forget comments!
 *   c. Should any of the variables actually be constants? If so, fix them.
 *   d. Check and fix the indentation.
 *   e. Run the program. Make changes to the program so the output is more readable.
 */
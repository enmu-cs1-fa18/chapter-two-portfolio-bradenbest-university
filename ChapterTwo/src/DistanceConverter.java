/**
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 */
public class DistanceConverter {
	/* Assignment:
	 * You want to know how many feet are in 3.5 yards, and how many inches are in 
	 * 3.5 yards. You write the following program for that purpose:
	 */
	
	public static void main (String[] args) {
		double yards = 3.5;

		System.out.printf("%.2f yards = %.2f feet\n",
				yards, UnitConverter.yardsToFeet(yards));
		
		System.out.printf("%.2f yards = %.2f inches\n",
				yards, UnitConverter.yardsToInches(yards));
	}
}

// Comments aren't necessary when the code is self-explanatory ;)

class UnitConverter { 
	final static double FEET_IN_YARDS = 3;
	final static double INCHES_IN_FEET = 12;
	
	public static double yardsToFeet(double yards){
		return yards * FEET_IN_YARDS;
	}
	
	public static double feetToInches(double feet){
		return feet * INCHES_IN_FEET;
	}
	
	public static double yardsToInches(double yards){
		return feetToInches(yardsToFeet(yards));
	}
}

/*   a. The problem with the code above is that using "magic numbers" makes the program 
 *      hard to debug and maintain. Modify the program so that it uses constants to improve
 *      legibility and makes it easier to maintain.
 *      -check
 *      
 *   b. Add chunking and comments to enhance the readability. Don't forget comments!
 *      -check, also see the huge comment below for my thoughts on comments
 *      
 *   c. Should any of the variables actually be constants? If so, fix them.
 *      -check
 *      
 *   d. Check and fix the indentation.
 *      -there's nothing wrong with the indentation, so check.
 *      
 *   e. Run the program. Make changes to the program so the output is more readable.
 *      -check
 */

/* Actually, seriously, comments should be avoided. Comments
 * can easily violate the DRY principle *and* become inaccurate
 * if not maintained alongside the code. They are also a distraction
 * and lead to cluttered code. Comments should always explain *why*,
 * not *how* the code does what it does. Example (C code):
 * 
 *     // returns the factorial of x by looping from x-1 to 0
 *     f(x){int t=x;while(--x>0)t*=x;return x;}
 * 
 * This is ugly, uses archaic K&R syntax, the comment, which is
 * an example of a "how x works" comment only serves to make it
 * harder to read, and it would be better written as, in proper
 * C89/99 style:
 * 
 *     // For the last time, do NOT change this to a recursive
 *     // implementation. Our project uses numbers in the *billions*.
 *     // Bob, take a break, do a Google search for "recursive
 *     // stack overflow", and I don't care how clever you think
 *     // you are, don't even think about doing that again.
 *     // -Seth (your boss)
 * 
 *     uint64_t factorial(uint64_t n){
 *         uint64_t total = n;
 *
 *         for(uint64_t i = n - 1; i > 0; --i)
 *             total *= i;
 *
 *         if(n == 0)
 *             return 1;
 *
 *         return total;
 *     }
 * 
 * The above is an example of a "why" comment (which is distinct
 * from a "how x works" comment) and code that is self-documenting
 * and easy-to-read. You can entirely rewrite factorial to, say,
 * use a subset of the gamma function, and the comment above it would
 * remain just as accurate as it was before.
 * 
 * How accurate would the comment explaining how f(x) works be if
 * the function were changed to use the gamma function?
 * 
 * Another bad type of comment is this:
 * 
 *     // x += 54
 *     x += 55
 * 
 * Commented out code (aka dead code) should be deleted, not 
 * committed, and is easily the worst offender when it comes to
 * code clutter.
 * 
 * I even did that in the 'Hello World (modified)' project.
 * Granted, I didn't upload a repository with commit history.
 * 
 * -Braden
 */

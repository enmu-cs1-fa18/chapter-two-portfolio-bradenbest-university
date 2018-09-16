

/**
 * Calculates how many full cases can be filled with a given number of cans.
 * 
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 */
public class CaseCounter {
	/*
	 * SPECIFICATIONS:
	 * You have 457 cans and a case holds 12 cans. 
	 * Print out how many full cases you will have. 
	 * Print out how many cans are left over. 
	 * (Should 457 and 12 be constants or be typed into the code?)
	 * 
	 * So in other words, 457 / 12 and 457 mod 12.
	 */
	
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	final static int CASE_SIZE = 12;
	
	public static void main(String[] args) {
		int ncans = 457;
		int[] result = case_em(ncans);
		
		// Here be dragons--I had to change the compiler compliance
		// level for this next line to compile. Printf requires
		// at least 1.5, which clearly 1.7 is too low for.
		// You know, javac via the commandline doesn't do this.
		// Just saying.
		System.out.printf("%d cans = %d cases (%d can(s) leftover)\n",
				ncans, result[0], result[1]);
	}
	
	public static int[] case_em(int cans){
		int[] ret = {cans / CASE_SIZE, cans % CASE_SIZE};
		return ret;
	}

}

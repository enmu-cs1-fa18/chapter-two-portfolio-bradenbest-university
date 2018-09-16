import java.util.Scanner;

/**
 * Calculates how many full cases can be filled with a given number of cans.
 * 
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 */
public class CaseCounterEnhanced {
	/*
	 * SPECIFICATIONS:
	 * A case holds 12 cans.
	 * Prompt the user to input a number of cans.
	 * Prompt user to input the cost of a can.
	 *  
	 * Print out how many full cases you will have. 
	 * Print out how many cans are left over. 
	 * Print out the total dollar value of the cans, formatted as money.
	 * 
	 * Make sure that each output value is printed on a separate line
	 * and that you describe each output clearly with words.
	 */
	
	final static int CASE_SIZE = 12;
	private static Scanner scanner;
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	public static void main(String[] args) {
		double ncans, can_price;
		
		scanner = new Scanner(System.in);
		
		ncans = get_input("Number of cans");
		can_price = get_input("Price of a can");
		
		System.out.printf("Full cases:     %d\n", (int)ncans / CASE_SIZE);
		System.out.printf("Cans left over: %d\n", (int)ncans % CASE_SIZE);
		System.out.printf("Subtotal:       $%.2f\n", ncans * can_price);
		
		scanner.close();
	}
	
	private static double get_input(String prompt){		
		System.out.print(prompt + " >");
		return scanner.nextDouble();
	}
}

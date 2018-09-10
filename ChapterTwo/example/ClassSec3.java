
// imported by Eclipse once we typed in the Scanner in statement:
import java.util.Scanner;

public class ClassSec3 {

	public static void main(String[] args) {
		// 2.3 Input/Output
	    // Create a Scanner object to read keyboard input
		Scanner in = new Scanner(System.in);
		// Display a prompt in the console window
		System.out.println("Please enter the number of bottles: ");
		//define a variable to hold the input value
		int bottles = in.nextInt();
		// the program waits for user input then places that input into the variable (bottles, in this case).
				
/*		// a variation of the prompt - is it better?
		System.out.print("Please enter the number of bottles");
		bottles = in.nextInt();
		
		// another variation of the prompt - is this one better?
		System.out.print("Please enter the number of bottles: ");
		bottles = in.nextInt();
*/
		
		// what if we want to input a double? Can you write the statements that will do it?
		
		
		// close the input stream
		in.close();
	
		/*
		 * API Documentation - search in the Internet browser for: java oracle documentation
		 * 
		 * Formatted output options: use printf(); instead of print(); or println();
		 * %d - 
		 * %f - 
		 * %4d - 
		 * %4f - 
		 */
		// try this combination:
		double price = 1233.3894;
		System.out.printf("Price per liter: $%10.2f", price);
		System.out.println();
		
		
	}

}

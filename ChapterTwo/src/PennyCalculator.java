/**
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 *
 */
public class PennyCalculator {
	 /*
	  * Assignment:  
	  *
	  *    Write a program to handle this task. You have 458 pennies in a jar. Calculate the number of dollars, 
	  *    quarters, dimes, nickels and pennies you will get from the bank. (The bank will give you the fewest coins 
	  *    possible.) Print out the number of dollars, quarters, dimes, nickels, and pennies you will get from the 
	  *    bank. Print out the total number of coins you will get. (Is a dollar bill a coin?)  
	  *    Print out each value on a different line.  
	 */
	
	// My code generalizes the task such that if you want, you can add in half-dollars by just adjusting
	// the arrays below. Try it.
	
	final static String[] FIELD_NAMES_SINGULAR = {"dollar", "quarter", "dime", "nickel", "penny"};
	final static String[] FIELD_NAMES_PLURAL = {"dollars", "quarters", "dimes", "nickels", "pennies"};
	final static int[] FIELD_VALUES = {100, 25, 10, 5, 1};
	final static int[] COIN_MAP = {0, 1, 1, 1, 1};
	
	public static void main(String[] args) {
		int pennies = 458;
		int[] fields = getChange(pennies);

		printChange(fields);
		System.out.printf("Total coins: %d", getTotalCoins(fields));
	}
	
	private static int[] getChange(int pennies){
		int[] out = new int[FIELD_VALUES.length];
		
		for(int i = 0; pennies > 0;){
			if(pennies - FIELD_VALUES[i] >= 0){
				pennies -= FIELD_VALUES[i];
				out[i]++;
			}
			
			else ++i;
		}
		
		return out;
	}
	
	private static String getFieldName(int fieldID, int value){
		return value == 1 ? FIELD_NAMES_SINGULAR[fieldID] : FIELD_NAMES_PLURAL[fieldID];
	}
	
	private static void printChange(int[] fields){
		for(int i = 0; i < fields.length; ++i)
			System.out.printf("%d %s\n", fields[i], getFieldName(i, fields[i]));
	}
	
	private static int getTotalCoins(int[] fields){
		int total = 0;
		
		for(int i = 0; i < fields.length; ++i)
			if(COIN_MAP[i] == 1)
				total += fields[i];
		
		return total;
	}
}

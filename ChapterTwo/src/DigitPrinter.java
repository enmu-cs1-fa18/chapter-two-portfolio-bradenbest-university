



/**
 * Takes any number up to 3 digits and print out each digit individually.
 * 
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 *
 */
public class DigitPrinter {
	/*
	 *    SPECIFICATIONS:
	 *    Write a program to handle this task. 
	 *    My favorite number is 349. 
	 * 	  Use final int MY_NUMBER = 349; 
	 *    Then use mod and integer division to break the number into pieces 
	 *    so you can print out each digit separately. 
	 *    (You should be able to change the value of MY_NUMBER 
	 *    to a different number and not have to change anything else in your code. 
	 *    When you re-execute your 
	 *    code, the output should match your changed value of MY_NUMBER.)
	 *    Print the first digit on one line, the second digit on the next line, and the third digit on the 
	 *    last line. Be sure to put some text before the digit that explains what it is.
	 *    The code should work for any value of MY_NUMBER up to 3 digits.
	 */
	final static int MY_NUMBER = 349;
	final static int MAXDIGITS = 10;
	/**
	 * So what I ended up doing is implementing a LIFO stack
	 * The stack has numbers pushed in backwards.
	 * Numbers are popped out backwards.
	 * Last in; first out.
	 * @param args
	 */
	public static void main(String[] args) {
		intstack is = parse(MY_NUMBER);
		
		is.dump();
		
		//parse(16777216).dump();
	}
	
	private static intstack parse(int n){
		intstack is = new intstack(MAXDIGITS);
		// I am aware of these things, by the way:
		// -> Vector<int> array = new Vector<int>();
		
		while(n > 0){
			is.push(n % 10);
			n /= 10;
		}
		
		return is;
	}

}

class intstack {
	private int[] data;
	private int ptr = 0;
	private int size;
	
	public intstack(int _size){
		size = _size;
		data = new int[size];
	}
	
	public void push(int value){
		if(ptr < size)
			data[ptr++] = value;
	}
	
	public int pop(){
		if(is_empty())
			return 0;
		
		return data[--ptr];
	}
	
	public Boolean is_empty(){
		return ptr == 0;
	}
	
	public void dump(){
		while(!is_empty())
			System.out.println(pop());
	}
}
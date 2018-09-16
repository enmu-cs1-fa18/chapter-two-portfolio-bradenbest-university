

/**
 * Calculates and prints the distance between two points.
 * @author Braden Best
 * @version 0.1
 * @date 2018-09-16
 *
 */
public class DistanceFormula {
	/*
	 * SPECIFICATIONS:
	 * Distance Formula: d=square root((x1-x2)^2+(y1-y2)^2 ), where (x1,y1 )  and (x2,y2 ) are 
	 * the two ordered pairs. 
	 * Find the distance between (6, 7) and (-3, -2) using the distance formula. 
	 * For extra credit, round the distance to the nearest hundredth using java. 
	 * Print an additional statement to report the rounded distance.
	 */
	
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] pair1 = {6, 7};
		int[] pair2 = {-3, -2};
		double result = find_distance(pair1, pair2);
		
		System.out.printf("distance = %f\nrounded  = %.2f", result, result);
		// cool, extra credit.
	}
	
	public static double find_distance(int[] pair1, int[] pair2){
		int diffx = pair1[0] - pair2[0];
		int diffy = pair1[1] - pair2[1];
		
		return Math.sqrt(Math.pow(diffx, 2) + Math.pow(diffy, 2));
	}

}

package basicprograms;

public class FibonacciNumbers {
	
	/*
	 * This program is to list the fibonacci series within the given range by the user.
	 * Fibonacci series is a series of numbers in which each number (Fibonacci number)
	 *  is the sum of the two preceding numbers.
	 */

	public static void main(String[] args) {
		
		//catching the returned array 
		int[] fiboNum = fibonNum(1,10);
		
		//Printing the returned fibonacci numbers
		for(int num = 0; num < fiboNum.length ; num++) {
			System.out.println(fiboNum[num]);
		}

	}
	/*
	 * This method will return the fibonacci series based on the input min and max 
	 */
	private static int[] fibonNum(int i, int j) {
		
		//initializing an array of length based on the input max
		int[] fNum = new int[j+1];
		
		/*
		 * checking if min is 0 or 1. as the first two numbers of the series are always 
		 * either 0,1 or 1,1
		 */
		if (i ==0) {
			fNum[0] = 0;
			fNum[1] = 1;
		}else if(i==1) {
			fNum[0] = 1;
			fNum[1] = 1;
		}
		
		//starting the series calculation from the third number
		for(int k = 2 ; k<=j; k++) {
			
				fNum[k] = k+(k-1);
			
		}
		return fNum;
	}

}

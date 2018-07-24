package basicprograms;
/*
 * This program will check if the number in 0-999 range is an Armstrong number or not
 * An Armstrong number is an n-digit number that is equal 
 * to the sum of the nth powers of its digits.
 * For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 */

public class PrintArmStrongNumber {

	public static void main(String[] args) {
		
		printArmStrongNumber();
	}

	private static void printArmStrongNumber() {
		
		//variable to show how many Armstrong numbers are in the given range
		int count = 0;
		
		for(int i=0; i<10000; i++) {
			//changing the number into a string
			String stringNum = String.valueOf(i);
			
			//separating the number into individual character
			char[] charNumArr = stringNum.toCharArray();
			
			//variable to store the sum of the nth power of numbers
			int addResult = 0;
			
			
			for(int letter=0; letter<charNumArr.length; letter++) {
				//retrieving the numeric value that the character holds and calculating the nth power based on the length of the number
				addResult += Math.pow(Character.getNumericValue(charNumArr[letter]), charNumArr.length);
			}
			
			if(addResult == i) {
				System.out.println(i + " is an Armstrong Number");
				count++;
			}
			
			
		}
		
		System.out.println("There are "+count+" below 10000");
		
	}

}

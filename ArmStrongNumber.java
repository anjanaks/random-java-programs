package basicprograms;

import java.util.Scanner;

/*
 * This program accepts a number from the user and returns a boolean to 
 * inform if the input is an Armstrong Number or not
 * An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
 * For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 */

public class ArmStrongNumber {

	public static void main(String[] args) {
		//using scanner instance to read user input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int inputNum = reader.nextInt();
		
		//close reader
		reader.close();
		
		if(IsArmStrongNumber(inputNum)){
			System.out.println(inputNum+" is an Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
	}

	private static boolean IsArmStrongNumber(int i) {
		//converting int to string to seperate into individual numbers
		String stringNum = String.valueOf(i);
		
		//separating the string into characters
		char[] stringDigits = stringNum.toCharArray();
		
		int addresult = 0;
		
		for(int letter = 0;letter<stringDigits.length;letter++) {
			//retrieving the numeric value the character represents and powering it to the length of the number
			addresult += Math.pow(Character.getNumericValue(stringDigits[letter]), (stringDigits.length));
			
			
		}
		
		
		return (addresult == i);
	}

}

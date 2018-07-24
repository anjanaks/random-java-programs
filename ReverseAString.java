package basicprograms;

import java.util.Scanner;

/*
 * This program accepts a string from the user and outputs the string in a reverse order
 */
public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a sentence or a word: ");
		String inputString = reader.nextLine();
		reader.close();
		
		reverseAString(inputString);

	}

	private static void reverseAString(String inputString) {
		
		//create a character array of the string
		char[] charArr = inputString.toCharArray();
		
		//empty character array for the reverse string
		char[] reverseCharArr = new char[charArr.length];
		
		
		for(int i = charArr.length-1, j=0; i>=0 && j<charArr.length;i--,j++) {
			
			reverseCharArr[j] = charArr[i];
					
		}
		
		String reverseString = String.valueOf(reverseCharArr);
		System.out.println(reverseString);
		
	}

}

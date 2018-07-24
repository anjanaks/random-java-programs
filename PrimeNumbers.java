package basicprograms;

public class PrimeNumbers {
	
	/*
	 * This program will print prime numbers within a given range
	 * of numbers by the user.
	 * A prime number is a whole number greater than 1 whose only 
	 * factors are 1 and itself. A factor is a whole numbers that can be 
	 * divided evenly into another number. A prime number is an odd number.
	 *  The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
	 */

	public static void main(String[] args) {
		
		 primeNumbers(100);
		
			
	}
	
	private static void primeNumbers(int userNum) {
		int[] priNum = new int[userNum];
		int[] oddNum = new int[userNum];
		int countO = 0;//count for the odd number index
		int countP = 0;//count for the prime number index
		int countF = 0;//final check count
		
		// 2 is the only prime number below 3
		if(userNum<2) {
			System.out.println("No prime numbers below "+userNum);
			
		}else if(userNum >=2) {
			
			priNum[countP] = 2;//adding 2 in the list
			countP++;
		

			//creating a list with all the odd numbers upto the user given number
			for(int numOdd = 3; numOdd < userNum;numOdd++) {

				if(numOdd%2 != 0) {
					oddNum[countO] = numOdd;
					countO++;
				}
			}


			//checking the odd number list for prime numbers
			for (int numP = 0; numP <countO; numP++) {
				
				//checking of the odd number is divisible by any other number
				for(int j=2 ; j<10 ; j++) {
					
					if((oddNum[numP]%j) == 0 && oddNum[numP] != j) {
						countF++;	
					}

				}
				
				//countF will be zero, if the number is only divisible by itself
				if(countF == 0) {
					priNum[countP] = oddNum[numP];
					countP++;

				}
				countF = 0;

			}

			
			System.out.println("Prime numbers upto "+userNum+" are: ");
			//printing the prime numbers
			for(int pIndex = 0;pIndex <countP;pIndex++) {
				System.out.println(priNum[pIndex]);
			}

		
	}

}
}

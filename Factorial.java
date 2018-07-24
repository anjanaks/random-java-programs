package basicprograms;

public class Factorial {

	public static void main(String[] args) {
		
		int finalFactorial = printFactorial(6);
		System.out.println(finalFactorial);

	}

	private static int printFactorial(int i) {
		
		if(i == 1) {
			return 1;
		}else {
			return i * printFactorial(i-1);
		}	
		
	}

}

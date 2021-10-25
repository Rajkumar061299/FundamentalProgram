package program;

import java.util.stream.IntStream;

public class CountTheDivisorOFTheNumber {

	/*
	 * 4 --> 3 (1, 2, 4) 
	 * 5 --> 2 (1, 5) 
	 * 12 --> 6 (1, 2, 3, 4, 6, 12) 
	 * 30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
	 
	 */
	
	public static long numberOfDivisors(int n) {
		/*
		 * int count = 0; for (int i = 1; i <= Math.sqrt(n); i++) { if (n % i == 0) { if
		 * (n / i == i) count++; else { count += 2; } } } return count;
		 */
	    return IntStream.range(1, n+1).filter(i -> n%i ==0).count();

	}

	public static void main(String[] args) {

		System.out.println(numberOfDivisors(30));
	}
}

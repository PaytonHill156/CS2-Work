package WeekFive;

import java.math.BigInteger;

public class FindPrimes {

	public static void main(String[] args) {
		/**10.18 (Large prime numbers) Write a program that finds 
		 * five prime numbers larger than Long.MAX_VALUE.
		 */
		
		BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
		int count = 0;
		
		while(count < 5) {
			if(number.isProbablePrime(1)) {
				count++;
				System.out.println(number);
			}
			number = number.add(new BigInteger("1"));
		}
	}
}

package WeekFive;

import java.math.BigInteger;

public class DivisibleByFiveOrSix {

	public static void main(String[] args) {
		/*10.21 (Divisible by 5 or 6) Find the first ten numbers greater 
		 * than Long.MAX_VALUE that are divisible by 5 or 6.
		 */
		BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
		int count = 0; 
		
		number = number.add(new BigInteger("1"));
		
		while(count < 10) {
			if(isDivisible(number)) {
				System.out.println(number);
				count++;
			}
			number = number.add(new BigInteger("1"));
		}

	}

	//method to test bigint to see if it is divisible by two or three
		//input -- bigint
		//output -- boolean
	public static boolean isDivisible(BigInteger number) {
		boolean divisible = false;

		if(number.mod(new BigInteger("5")).compareTo((new BigInteger("0"))) == 0) {
			divisible = true;
		}

		if(number.mod(new BigInteger("6")).compareTo((new BigInteger("0"))) == 0) {
			divisible = true;
		}


		return divisible;

	}
}

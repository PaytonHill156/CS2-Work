package WeekFive;

import java.math.BigInteger;

public class DivisibleByTwoOrThree {

	public static void main(String[] args) {
		/*10.16 (Divisible by 2 or 3) Find the first ten numbers 
		 * with 50 decimal digits that are divisible by 2 or 3.
		 */
		BigInteger startingNumber = getStartingNumber();
		int count = 0;

		while(count < 10) {
			if(isDivisible(startingNumber)) {
				System.out.println(startingNumber);
				count++;
			}
			startingNumber = startingNumber.add(new BigInteger("1"));
		}
	}
	
	//method to create our first number
		//input -- void
		//output -- BigInteger
	public static BigInteger getStartingNumber() {
		String numberAsString = new String();
		BigInteger number;
		
		numberAsString = "1";
		
		for(int i = 0; i < 49; ++i) {
			numberAsString = numberAsString + "0";
		}
		number = new BigInteger(numberAsString);
		
		return number;
	}
	
	//method to test bigint to see if it is divisible by two or three
		//input -- bigint
		//output -- boolean
	public static boolean isDivisible(BigInteger number) {
		boolean divisible = false;
		
		if(number.mod(new BigInteger("2")).compareTo((new BigInteger("0"))) == 0) {
			divisible = true;
		}
		
		if(number.mod(new BigInteger("3")).compareTo((new BigInteger("0"))) == 0) {
			divisible = true;
		}
		
		
		return divisible;
		
	}

}

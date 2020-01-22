package WeekOne;

import java.util.Random;

public class CrapsLoop {

	public static void main(String[] args) {
		/*(Game: craps) Craps is a popular dice game played in casinos. 
		 * Write a program to play a variation of the game, as follows: 
		 * Roll two dice. Each die has six faces representing values 
		 * 1, 2, …, and 6, respectively. Check the sum of the two dice. 
		 * If the sum is 2, 3, or 12 (called craps), you lose; 
		 * if the sum is 7 or 11 (called natural), you win; 
		 * if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. 
		 * Continue to roll the dice until either a 7 or the same point value is rolled. 
		 * If 7 is rolled, you lose. Otherwise, you win. 
		 * Your program acts as a single player.
		 */

		/* Revise Exercise 6.30 to run it 10,000 times and 
		 * display the number of winning games.
		 */

		int numberOfWins = 0;

		for(int i = 0; i < 10000; i++) {
			//roll two dice (1 - 6)
			int rollValue = rollTwoDice();

			//check sum of dice for winning or losing number

			switch (evaluateRollValue(rollValue)) {
			case 0: 
				//gameOver();
				numberOfWins++;
				break;
			case 1: 
				//gameOver();
				break;
			case 2: 
				numberOfWins = numberOfWins + keepRolling(rollValue);
				break;
			default: 
				System.out.println("Something is broken.");
				break;
			}

		}

		System.out.println("Out of 10,000 games, you won: " + numberOfWins);


	}

	//method to roll the two dice 1-6
	//input -- nothing
	//output -- integer
	private static int rollTwoDice() {
		//create dice as random numbers between 1 and 6 
		Random diceNumberGenerator = new Random();

		int firstDie = diceNumberGenerator.nextInt(6) + 1;
		int secondDie = diceNumberGenerator.nextInt(6) + 1;
		int roll = firstDie + secondDie;

		return roll;
	}


	//method to evaluate roll value
	//input -- integer
	//output -- nothing 
	private static int evaluateRollValue(int rollValue) {
		//first check and see if they rolled a number that made them win or lose

		if(rollValue == 7 || rollValue == 11) {
			return 0;
		}
		if(rollValue == 2 || rollValue == 3 || rollValue == 12) {
			return 1;
		}else {
			return 2;
		}

	}

	//method to keep rolling until seven or point
	//input -- integer
	//output -- nothing
	private static int keepRolling(int initialRollValue) {
		boolean gameOver = false;

		while (gameOver == false) {
			int attempt = rollTwoDice();

			if(initialRollValue == attempt) {
				gameOver = true;
				return 1;
			}
			if(attempt == 7) {
				gameOver = true;
			}
		}
		//gameOver();
		return 0;
	}
}


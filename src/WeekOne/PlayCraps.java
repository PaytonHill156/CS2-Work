package WeekOne;
import java.util.Random;
import java.util.Scanner;

public class PlayCraps {

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

		//say hello
		sayHello();
		//print rules
		printRules();
		//get user to roll dice

		//roll two dice (1 - 6)
		int rollValue = rollTwoDice();

		//check sum of dice for winning or losing number

		switch (evaluateRollValue(rollValue)) {
		case 0: 
			gameOver();
			break;
		case 1: 
			gameOver();
			break;
		case 2: 
			keepRolling(rollValue);
			break;
		default: 
			System.out.println("Something is broken.");
			break;
		}

	}

	//greet the player
	//input -- nothing
	//output -- nothing
	public static void sayHello() {
		System.out.println("Hello Player! Are you ready to roll?");
	}

	//print the rules
	//input -- nothing
	//output -- nothing
	public static void printRules() {
		System.out.println("This game is called Craps. Here are the rules: ");
		System.out.println("1. You roll two dice and add thier scores together. ");
		System.out.println("2. If the total value is equal to a 7 or 11, you rolled a Natural. This means you win!");
		System.out.println("3. If the total value is equal to a 2, 3, or 12, you rolled Craps. This means you lost.");
		System.out.println("4. If the total value is not equal to any of those, you keep rolling until ");
		System.out.println("  a. You roll a 7.");
		System.out.println("  b. You roll the same point value.");
		System.out.println("5. If you roll the 7, you lose. If you roll the point, you win!");

	}

	//method to roll the two dice 1-6
	//input -- nothing
	//output -- integer
	private static int rollTwoDice() {
		//begin by pressing enter
		continueWithEnter();
		//create dice as random numbers between 1 and 6 
		Random diceNumberGenerator = new Random();

		int firstDie = diceNumberGenerator.nextInt(6) + 1;
		int secondDie = diceNumberGenerator.nextInt(6) + 1;
		int roll = firstDie + secondDie;

		System.out.println("You rolled a " + firstDie + " and a " + secondDie + " making your score a " + roll);

		return roll;
	}


	//method to evaluate roll value
	//input -- integer
	//output -- nothing 
	private static int evaluateRollValue(int rollValue) {
		//first check and see if they rolled a number that made them win or lose

		if(rollValue == 7 || rollValue == 11) {
			System.out.println("You rolled a Natural! Congratulations! You win!");
			return 0;
		}
		if(rollValue == 2 || rollValue == 3 || rollValue == 12) {
			System.out.println("Craps! You lost this round.");
			return 1;
		}else {
			System.out.println("You rolled " + rollValue + ".");
			return 2;
		}

	}

	//method to keep rolling until seven or point
	//input -- integer
	//output -- nothing
	private static void keepRolling(int initialRollValue) {
		boolean gameOver = false;

		while (gameOver == false) {
			System.out.println("Keep rolling!");
			int attempt = rollTwoDice();

			if(initialRollValue == attempt) {
				System.out.println("You rolled " + initialRollValue + " again! You win the game!");
				gameOver = true;
			}
			if(attempt == 7) {
				System.out.println("Aww. You lost.");
				gameOver = true;
			}

		}

		gameOver();
	}

	//method to end game
	//input -- nothing
	//output -- nothing
	private static void gameOver() {
		System.out.println("Thanks for playing!");

	}


	//method to let the user continue by pressing the enter key
	//I went to this web site for help https://stackoverflow.com/questions/26184409/java-console-prompt-for-enter-input-before-moving-on
	//input -- nothing
	//output -- nothing
	public static void continueWithEnter() {
		System.out.println("Press ENTER to roll.");
		Scanner keyInput = new Scanner(System.in);
		keyInput.nextLine();

	}
}



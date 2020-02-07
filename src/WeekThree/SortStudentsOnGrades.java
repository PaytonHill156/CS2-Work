package WeekThree;

import java.util.Scanner;

public class SortStudentsOnGrades {

	public static void main(String[] args) {
		/*Rewrite Listing 8.2, GradeExam.java, to display the students 
		 * in increasing order of the number of correct answers.
		 */
		Scanner keyInput = new Scanner(System.in);
		int userInput;
		char[][] answers = { 
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, 
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, 
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, 
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		}; 
		BST sortedAnswers = new BST(GetCorrectCount(answers[0]), answers[0]);


		for(int i = 1; i < answers.length; ++i) {
			sortedAnswers.addNode(GetCorrectCount(answers[i]), answers[i]);
		}


		System.out.println("Would you like to print students grades from: ");
		System.out.println("1. Highest to Lowest");
		System.out.println("2. Lowest to Highest");
		userInput = keyInput.nextInt();
		keyInput.close();
		if(userInput == 1) {
			sortedAnswers.printHighToLow();
		} else if (userInput == 2) {
			sortedAnswers.printLowToHigh();
		}else {
			System.out.println("Not a valid input.");
		}
	}

	//checks all students answers against the key
	//input -- char [][]
	//output -- int correct count
	private static int GetCorrectCount(char[] answers) {
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; 
		int score = 0;

		for(int i = 0; i < answers.length; ++i) {
			if(keys[i] == answers[i]) {
				score = score + 1;
			}
		}
		return score;
	}
}

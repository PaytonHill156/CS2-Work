package WeekOne;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		/* Write a method with the following header to display three 
		 * numbers in increasing order: public static void 
		 * displaySortedNumbers( double num1, double num2, double num3) 
		 * Write a test program that prompts the user to enter three 
		 * numbers and invokes the method to display them in increasing order.
		 */
		
		int arraySize;
		
		sayHello();
		
		arraySize = getArraySize();
		
		double [] numbersToSort = new double [arraySize];
		numbersToSort = fillArrayWithUserInput(arraySize);
		
		double[] sortedNumbers = new double [arraySize];
		sortedNumbers = sortUserInput(numbersToSort);
		
		displaySortedNumbers(sortedNumbers);

		System.out.println("Thanks! See ya next time!");
	}
	
	//method to greet the user
		//input -- nothing
		//output -- nothing
	public static void sayHello() {
		System.out.println("Hello! This is your automatic number sorter.");
		System.out.println("Please input the amount of numbers you want to sort.");
	}
	
	//method to get size of the array
		//input -- nothing
		//output -- integer
	public static int getArraySize() {
		Scanner keyInput = new Scanner(System.in);
		int userInput; 
		
		userInput = keyInput.nextInt();
		
		return userInput;
	}
	
	//method to fill array with user input 	
		//input -- integer
		//output -- array
	public static double[] fillArrayWithUserInput(int arraySize) {
		double [] filledArray = new double [arraySize];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers you want to sort.");
		for(int i = 0; i < arraySize; i++) {
			filledArray[i] = input.nextDouble();
		}
		return filledArray;
	}
	
	//method to sort array
		//input -- array
		//output -- array
	public static double[] sortUserInput(double[] numbersToSort) {
		Arrays.sort(numbersToSort);
		return numbersToSort;
	}
	
	//method to print the values in the array
		//input -- array
		//output -- nothing
	public static void displaySortedNumbers(double[] sortedNumbers) {
		System.out.println(Arrays.toString(sortedNumbers));
	}
}


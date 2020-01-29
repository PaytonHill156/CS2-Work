package WeekTwo;

import java.util.Scanner;

public class ExecutionTime {

	public static void main(String[] args) {
		/*(Execution time) Write a program that randomly generates 
		 * an array of 100,000 integers and a key. Estimate the 
		 * execution time of invoking the linearSearch method in 
		 * Listing 7.6. Sort the array and estimate the execution 
		 * time of invoking the binarySearch method in Listing 7.7. 
		 * You can use the following code template to obtain the execution time: 
		 * long startTime = System.currentTimeMillis(); perform the task; 
		 * long endTime = System.currentTimeMillis(); 
		 * long executionTime = endTime - startTime;
		 */
		//This program uses the ArraySort class

		ArraySort sortArray = new ArraySort();
		Integer[] array = new Integer[0];
		Scanner keyInput = new Scanner(System.in);
		int userInput;
		long startTime;
		long endTime;
		long executionTime = 0;

		sortArray.sayHello();

		array = sortArray.sizeArray(10000);

		array = sortArray.fillArrayWithRandom(array);


		System.out.println("Would you like to sort your numbers in:");
		System.out.println("1. Ascending Order");
		System.out.println("2. Descending Order");
		userInput = keyInput.nextInt();

		if(userInput == 1) {
			startTime = System.currentTimeMillis();
			array = sortArray.sortArrayAscending(array);
			endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;

		}else if(userInput == 2) {
			startTime = System.currentTimeMillis();
			array = sortArray.sortArrayDescending(array);
			endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;

		}else {
			System.out.println("Invalid response.");
		}


		sortArray.printArray(array);
		System.out.println();
		System.out.println("It took " + executionTime + " milliseconds for your array to sort.");
	}
}

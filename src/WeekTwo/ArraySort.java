package WeekTwo;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Collections;


public class ArraySort {

	//says hello to user
		//input -- nothing
		//return -- nothing
	public void sayHello() {
		System.out.println("Hello, today we're going to see how fast your number sorter is.");
	}


	//creates an array with the given size 
		//input -- integer
		//return -- array
	public Integer[] sizeArray(int arraySize) {
		Integer[] arrayToFill = new Integer [arraySize];

		return arrayToFill;
	}

	//fills the array with random numbers. 
		//input -- array
		// return -- filled array
		// I used this site for help https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
	public Integer[] fillArrayWithRandom(Integer[] arrayToFill) {

		for (int i = 0; i < arrayToFill.length; i ++) {
			//look at for each
			int randomNum = ThreadLocalRandom.current().nextInt(-1000, 1000 + 1);
			arrayToFill[i] = randomNum;
		}

		return arrayToFill;
	}

	//sorts array in reverse order
		//input -- array
		//output -- array
	public Integer[] sortArrayDescending(Integer[] arrayToSort) {

		Arrays.sort(arrayToSort, Collections.reverseOrder());

		return arrayToSort;
	}

	//sorts array in ascending order
		//input -- array
		//return -- array
	public Integer[] sortArrayAscending(Integer[] arrayToSort) {

		Arrays.parallelSort(arrayToSort);

		return arrayToSort;
	}

	//prints array to console
		//input -- array
		//return -- nothing
	public void printArray(Integer[] arrayToPrint) {

		for (int i = 0; i < arrayToPrint.length; i++) {
			if (i % 20 == 0 && i > 0) {
				System.out.println();
			}
			System.out.print(arrayToPrint[i] + " ");
		}
	}
}

package WeekThree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ShuffleRows {

	public static void main(String[] args) {
		/*(Shuffle rows) Write a method that shuffles the rows in a 
		 * two-dimensional int array using the following header: 
		 * public static void shuffle(int[][] m) 
		 * Write a test program that shuffles the following matrix: 
		 * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}}; 
		 */
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		printMatrix(m);
		m = shuffle(m);
		printMatrix(m);



	}

	//method to shuffle matrix
	//input -- int [][]
	//output -- int [][]
	public static int[][] shuffle(int[][] m) {
		Random rand = new Random(System.currentTimeMillis());
        int[][] temp = new int[m.length][2];
        boolean[] copied = new boolean[m.length];

        for(int i = 0; i < m.length; ++i){
            copied[i] = false;
        }

        for(int i = 0; i < m.length; ++i){
            boolean foundNewPosition = false;
            while(!foundNewPosition){
                int randPos = rand.nextInt(m.length);
                if(!copied[randPos]){
                    copied[randPos] = true;
                    foundNewPosition = true;
                    temp[i] = m[randPos].clone();
                }
            }
        }

        return temp;
	}

	//method to print shuffled matrix
	//input -- int [][]
	//ouput -- void
	public static void printMatrix(int[][] m) {

		for(int i = 0; i < m.length; ++i){
			System.out.print(Arrays.toString(m[i]) + ", ");
		}
		System.out.println();
	}
}

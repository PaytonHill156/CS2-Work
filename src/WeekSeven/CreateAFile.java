package WeekSeven;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateAFile {

	public static void main(String[] args) {
		/*Write a program to create a file named 
		 * Exercise12_15.txt if it does not exist. Write 100 integers 
		 * created randomly into the file using text I/O. Integers are 
		 * separated by spaces in the file. Read the data back from the 
		 * file and display the data in increasing order.
		 */

		PrintWriter output;
		int randomNumbers;
		Random rnd = new Random(System.currentTimeMillis());
		String fileName = "C:\\Users\\Tori\\Desktop\\Exercise12_15.txt";
		File file;
		Scanner input;
		
		
		try {
			file = new File(fileName);
			file.createNewFile();
			
		}catch(IOException error) {
			System.out.println("An error has occurred.");
			error.printStackTrace();
		}
		
		
		try {
			output = new PrintWriter(fileName);

			for(int i = 0; i < 100; ++i) {
				randomNumbers = rnd.nextInt(1000);
				output.print(randomNumbers);
				output.print(" ");
			}
			output.flush();
			output.close();
			
		}catch(IOException error){
			System.out.println("An error has occurred.");
			error.printStackTrace();
		}
		
		try {
			file = new File(fileName);
			input = new Scanner(file);
			int[] numbers = new int[100];
			int count = 0;
			
			while(input.hasNextInt()) {
				numbers[count] = input.nextInt();
				count++;
			}
			Arrays.sort(numbers);
			
			for(int i = 0; i < 100; ++i) {
				System.out.println(numbers[i]);
			}
		}catch(IOException error) {
			System.out.println("An error was found.");
			error.printStackTrace();
		}
	}
}
